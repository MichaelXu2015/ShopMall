package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启服务网关
public class ShopZuulApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ShopZuulApplication.class, args);
	}

}
