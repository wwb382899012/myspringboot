package com.wwb.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wwb.demo.entity.AppMessage;
import com.wwb.demo.json.RespJson;
import com.wwb.demo.service.AppMessageService;

@RestController
@RequestMapping("/app")
public class AppMessageController {
	
	@Autowired 
	private AppMessageService appmessageservice;
	
	@RequestMapping("/getAll")
    public List<AppMessage> getAllMessage(){
        
        List<AppMessage> list = appmessageservice.getMessage();
        int num = list.size();
        if(null!=list && num>3){
            for (int i = 0; i < num-3; i++) {
                list.remove(0);
            }
        }
        return list;
    }
	
	/**
	 * 测试
	 * @return
	 */
	@RequestMapping("/getAllJson")
    public RespJson getPersonsJson(){
		return RespJson.success();
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
