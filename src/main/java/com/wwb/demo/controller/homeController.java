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
	
	
	@RequestMapping("/temp")
	public String welcome(Map<String,Object> map){
		map.put("name", "我被替换了");
		map.put("id", "p_id");
		
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1,"温文斌",21));
		persons.add(new Person(1,"yyy",22));
		persons.add(new Person(1,"xxj",23));
		map.put("persons",persons);
		return "temp";//加载html文件
		
	}
}
