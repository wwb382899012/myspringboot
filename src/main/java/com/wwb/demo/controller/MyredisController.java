package com.wwb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/redis")
public class MyredisController {

	@Autowired
	private StringRedisTemplate strRedis;
	
	@RequestMapping("/getRedis")
	@ResponseBody
	public String getRedis(){
		strRedis.opsForValue().set("spring-redis","wwb");
		return "redis字符："+strRedis.opsForValue().get("spring-redis");
	}
}
