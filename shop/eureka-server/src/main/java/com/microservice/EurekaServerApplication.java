package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  Eureka服务注册中心,shop-goods,shop-user服务提供者向这里注册
 * @author qzy
 *
 */
@SpringBootApplication
@EnableEurekaServer//将服务注册到eureka服务中
public class EurekaServerApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
