package com.wwb.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ch.qos.logback.classic.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	Logger logger = (Logger) LoggerFactory.getLogger(RestApplication.class);
	
	@Test
	public void contextLoads() {
		
		logger.error("错误。。。");
		
	}

}
