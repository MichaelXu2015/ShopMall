package com.microservice.config;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;

import com.netflix.zuul.ZuulFilter;

/**
 * 通过继承ZuulFilter 可以获取请求的相关信息,如是否携带正确的参数或者token等
 * FristPreFilter -> SecondPreFilter filterOrder指定执行次序
 * @author qzy
 *
 */
public class FristPreFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("shouldFilter");
		return true;
	}

	@Override
	public Object run() {
		System.out.println("这是第一个filter");
		return null;
	}

	@Override
	public String filterType() {
		System.out.println("filterType");
		return "pre";
	}

	@Override
	public int filterOrder() {
		System.out.println("filterOrder");
		return 0;
	}

}
