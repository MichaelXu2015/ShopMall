package com.microservice.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.microservice.common.ServerResponse;
import com.microservice.token.JWTTokenUtil;
import com.microservice.token.Token;
import com.microservice.token.TokenConstant;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class LoginPreFilter extends ZuulFilter{

	Logger logger = Logger.getLogger(getClass());
	
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		//获取路径和token等
		System.out.println("LoginPreFilter run ");
		RequestContext requestContext = RequestContext.getCurrentContext();
		requestContext.getResponse().setCharacterEncoding("UTF-8");//设置UTF-8防止中文乱码
		HttpServletRequest httpServletRequest = requestContext.getRequest();
		String uri = httpServletRequest.getRequestURI();
		System.out.println("uri === "+uri);
		if(uri.contains("/user/login") || uri.contains("/user/register") ) {
			//如果是登录或者注册不验证token
			logger.info("登录和注册不检验token");
			return null;
		}else {
			String token = httpServletRequest.getHeader("token");//在头部获取请求信息
			logger.info("token ====== "+token);
			//判断是否携带token
			if(token==null || token.equals("")) {
				  //对该请求禁止路由,也就是禁止访问下游服务，后面的filter就不会执行了
				  requestContext.setSendZuulResponse(false);
				  //响应到客户端的信息
				  requestContext.setResponseBody("{\"status\":500,\"message\":\"token 为 null\"}");
				  //保存一个标记作为下一个filter的执行开关,下一个shouldFilter的判断
				  requestContext.set("login-is-success", false); 
				  return null; 
				  
			  
			} 
			JWTTokenUtil tokenUtil = JWTTokenUtil.defaultUtil();
			Token tokenBean = tokenUtil.parse(token, TokenConstant.SECRET);
			Integer tokenResult = tokenUtil.tokenIllegality(tokenBean);
			ServerResponse sp = null;
			switch (tokenResult) {
				case 1:
					logger.info("token 非法");
					requestContext.setSendZuulResponse(false);
					sp = ServerResponse.createFail(500, "token非法");
					requestContext.setResponseBody(new Gson().toJson(sp));
					requestContext.set("login-is-success", false); 
					break;
				case 2:
					logger.info("token 过期");
					requestContext.setSendZuulResponse(false);
					sp = ServerResponse.createFail(500, "token过期");
					requestContext.setResponseBody(new Gson().toJson(sp));
					requestContext.set("login-is-success", false); 
					break;
				case 3:
					logger.info("token 无效");
					requestContext.setSendZuulResponse(false);
					sp = ServerResponse.createFail(500, "token无效");
					requestContext.setResponseBody(new Gson().toJson(sp));
					requestContext.set("login-is-success", false); 
					break;
				default:
					
					break;
			}
		}
		
		requestContext.set("login-is-success", true);
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
