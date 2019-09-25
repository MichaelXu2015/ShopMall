package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
  *  用户信息服务提供者
 * @author qzy
 *
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient //将服务注册到eureka服务中
@EnableDiscoveryClient//开启服务发现
public class ShopUserApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ShopUserApplication.class, args);
	}

}
