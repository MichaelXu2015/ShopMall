package com.microservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
  *  商品服务提供者
 * @author qzy
 *
 */
@SpringBootApplication
@EnableEurekaClient //将服务注册到eureka服务中
@EnableDiscoveryClient//开启服务发现
public class ShopGoodsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ShopGoodsApplication.class, args);
	}

}
