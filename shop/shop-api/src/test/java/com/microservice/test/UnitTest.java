package com.microservice.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import com.microservice.util.RedisUtil;

@ComponentScan("com.microservice")
public class UnitTest {

	@Autowired
	RedisUtil redisUtil;
	
	@Test
	public void hello() {
		System.out.println(" hello world"+redisUtil);
	}
}
