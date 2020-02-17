package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestRedisApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(TestRedisApplication.class, args);
		MyRedis redis = run.getBean(MyRedis.class);
		redis.test();
	}

}
