package com.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.microservice.filter.LoginPreFilter;

@Configuration
public class ZuulConfig {
	
	@Bean
	public LoginPreFilter loginFilter() {
		return new LoginPreFilter();
	}
	
	
	
}
