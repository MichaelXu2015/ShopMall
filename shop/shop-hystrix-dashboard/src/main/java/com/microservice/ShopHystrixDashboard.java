package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 此工程是hystrixdashboard监控服务调用的状态
 * 1.在pom文件中加上
 * <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-hystrix</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
		</dependency>
		
   2.在启动类上加上@EnableHystrixDashboard
   3.在浏览器中启动http://localhost:10000/hystrix出现监控界面
   4.在界面输入被监控的服务地址如：http://localhost:8004/hystrix.strean
   5.然后通过消费者调用被监控的服务，观察现象
 * @author qzy
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableHystrixDashboard //开启hystrixDashboard监控
public class ShopHystrixDashboard {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ShopHystrixDashboard.class, args);
	}
	
	

}
