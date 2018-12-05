package com.wwb.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wwb.demo.RestApplication;
import com.wwb.demo.common.RestException;
import com.wwb.demo.common.ResultCodeEnum;
import com.wwb.demo.dto.PersonDto;
import com.wwb.demo.dto.UserDto;
import com.wwb.demo.entity.Person;
import com.wwb.demo.json.RespJson;

import ch.qos.logback.classic.Logger;



@Controller
public class homeController extends BaseController{
	
	
	/**
	 * 默认欢迎也
	 * @return
	 */
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	/**
	 * 默认欢迎也
	 * @return
	 */
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/doLogin")
	@ResponseBody
	public RespJson doLogin(@RequestBody @Validated UserDto dto){
		RespJson json = RespJson.success();
		try {
			if(dto.getPwd()=="123456"){//模拟登陆成功
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			throw new RestException(ResultCodeEnum.FAIL);
		}
		
		return json;
		
		
	}
	
	/**
	 * 全局异常捕获
	 * @return
	 */
	@RequestMapping("/myerror")
	public String test(){
		Integer a =1/0;
		return "error";
	}
	
	
	
	
	
}
