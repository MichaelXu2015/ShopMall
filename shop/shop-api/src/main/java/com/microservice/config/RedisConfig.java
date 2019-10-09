package com.microservice.config;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@PropertySource("classpath:redis.properties")
public class RedisConfig {
	    Logger logger = Logger.getLogger(getClass());

	    @Value("${spring.redis.host}")
	    private String host;

	    @Value("${spring.redis.port}")
	    private int port;

	    @Value("${spring.redis.timeout}")
	    private int timeout;

	    @Value("${spring.redis.jedis.pool.max-idle}")
	    private int maxIdle;

	    @Value("${spring.redis.jedis.pool.min-idle}")
	    private int minIdle;

	    @Value("${spring.redis.jedis.pool.max-wait}")
	    private long maxWaitMillis;

	    @Value("${spring.redis.password}")
	    private String password;

	    @Value("${spring.redis.jedis.pool.max-active}")
	    private int maxActive;

	    @Value("${spring.redis.block-when-exhausted}")
	    private boolean  blockWhenExhausted;
	
	    
	    @Bean
	    public JedisPool redisPoolFactory() {
	    	JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
	    	// 连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true
	        jedisPoolConfig.setBlockWhenExhausted(true);

	        // 最大空闲连接数, 默认8个
	        jedisPoolConfig.setMaxIdle(maxIdle);

	        // 最小空闲连接数, 默认0
	        jedisPoolConfig.setMinIdle(minIdle);

	        // 最大连接数, 默认8个
	        jedisPoolConfig.setMaxTotal(maxActive);

	        // 获取连接时的最大等待毫秒数(如果设置为阻塞时BlockWhenExhausted),如果超时就抛异常, 小于零:阻塞不确定的时间,
	        // 默认-1
	        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);


	        // 连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true
	        jedisPoolConfig.setBlockWhenExhausted(blockWhenExhausted);


	        // 是否启用pool的jmx管理功能, 默认true
	        jedisPoolConfig.setJmxEnabled(true);

	        // 在获取连接的时候检查有效性, 默认false
	        jedisPoolConfig.setTestOnBorrow(true);

	        // 在归还连接的时候检查有效性, 默认false
	        jedisPoolConfig.setTestOnReturn(true);


	        //注意:当redis没有密码时,构造方法就不要传密码
	        //JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port,timeout,password);

	        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port,timeout);
	        
	        return jedisPool;
	    }


}
