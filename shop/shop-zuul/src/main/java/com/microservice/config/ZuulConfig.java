package com.microservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {
	
	@Bean
	public FristPreFilter firstPreFilter() {
		return new FristPreFilter();
	}
	
	
	@Bean
	public SecondPreFilter secondPreFilter() {
		return new SecondPreFilter();
	}
}
