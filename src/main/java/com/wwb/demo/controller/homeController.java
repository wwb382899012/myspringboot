package com.wwb.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wwb.demo.entity.Person;

@Controller
public class homeController {
	
	/**
	 * 默认欢迎也
	 * @return
	 */
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	
	
	
	
	
}
