package com.microservice.config;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class SecondPreFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		System.out.println("这是SecondPreFilter");
		RequestContext requestContext = RequestContext.getCurrentContext();
		requestContext.getResponse().setCharacterEncoding("UTF-8");//设置UTF-8防止中文乱码
		HttpServletRequest httpServletRequest = requestContext.getRequest();
		String token = httpServletRequest.getHeader("token");//在头部获取请求信息
		System.out.println(" token === "+token);
		//判断是否携带token
		
		if(token==null) {
			  //对该请求禁止路由,也就是禁止访问下游服务，后面的filter就不会执行了
			  requestContext.setSendZuulResponse(false);
			  //响应到客户端的信息
			  requestContext.setResponseBody("{\"status\":500,\"message\":\"token 为 null\"}");
			  //保存一个标记作为下一个filter的执行开关,下一个shouldFilter的判断
			  requestContext.set("login-is-success", false); 
			  return null; 
			  
		  
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
		return 2;
	}

}
