package com.wwb.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wwb.demo.dto.PersonDto;

@RestController
@RequestMapping("/person")
public class PersonController {
	/**
	 * 人员：详情页面
	 * 访问：http://lcoalhost:端口/person/detail?id=1
	 * @param id
	 * @return
	 */
	@RequestMapping("/detail")
	@ResponseBody
	public String detail(@RequestParam(value="id") Integer id){
		
		return "第"+id+"个人员";
	}
	
	/**
	 * 
	 * @param dto
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public String list(@RequestBody @Validated PersonDto dto){
		
		
		return dto.getName();
	}
	
	@RequestMapping("/err")
	@ResponseBody
	public String err(){
		Integer a = 1/0;
		return "json exception";
	}
	
}
