package com.wwb.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wwb.demo.entity.AppuserMessage;
import com.wwb.demo.json.RespJson;
import com.wwb.demo.service.AppuserMessageService;

@RestController
@RequestMapping("/app")
public class AppuserMessageController {
	
	@Autowired 
	private AppuserMessageService appmessageservice;
	
	/**
	 * 获取所有消息
	 * @return
	 */
	@RequestMapping("/getAll")
    public List<AppuserMessage> getAllMessage(){
        
        List<AppuserMessage> list = appmessageservice.getMessage();
        int num = list.size();
        if(null!=list && num>3){
            for (int i = 0; i < num-3; i++) {
                list.remove(0);
            }
        }
        return list;
    }
	
	/**
	 * 获取所有消息
	 * @return RespJson
	 */
	@RequestMapping("/getAllJson")
    public RespJson getPersonsJson(){
		
		 List<AppuserMessage> list = appmessageservice.getMessage();
	        int num = list.size();
	        if(null!=list && num>3){
	            for (int i = 0; i < num-3; i++) {
	                list.remove(0);
	            }
	        }
		
		return RespJson.success(list);
    }
	
	@RequestMapping("result")
	public String result() {
		return "appMessage/index";
	}
	
	/**
	 * 测试
	 * @return
	 */
	@RequestMapping("/getPersons2")
    public List<String> list(){
      
		List<String> persons = new ArrayList<>();
		persons.add("wwb");
		return persons;
    }
	
	
	

}
