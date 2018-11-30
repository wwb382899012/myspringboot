package com.wwb.demo;


import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

//主配置类
@SpringBootApplication
//@MapperScan("com.wwb.demo.mapper")
public class RestApplication {

	Logger logger = (Logger) LoggerFactory.getLogger(RestApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
		
		System.out.println("============== demo start  success =============");

	}
	
	@Test
	public void contextLoads() {
		
		logger.error("错误日志...");
		
	}
}
