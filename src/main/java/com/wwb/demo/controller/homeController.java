package com.wwb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "欢迎，这是首页";
		
	}
}
