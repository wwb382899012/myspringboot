package com.wwb.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwb.demo.entity.AppuserMessage;
import com.wwb.demo.mapper.mapper.AppuserMessageMapper;

@Service
public class AppuserMessageService {

	@Autowired
	private AppuserMessageMapper mapper;
	
	public List<AppuserMessage> getMessage(){
		List<AppuserMessage> list = new ArrayList<AppuserMessage>();
        list = mapper.selectAll();
        return list;
		
	}
}
