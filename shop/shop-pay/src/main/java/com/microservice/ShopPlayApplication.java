package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //将此服务注册到Eureka服务中心
@EnableDiscoveryClient //开启服务发现
public class ShopPlayApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ShopPlayApplication.class, args);
	}

}
