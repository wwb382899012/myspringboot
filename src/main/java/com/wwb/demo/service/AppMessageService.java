package com.wwb.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwb.demo.entity.AppMessage;
import com.wwb.demo.mapper.AppMessageMapper;

@Service
public class AppMessageService {

	@Autowired
	private AppMessageMapper mapper;
	
	public List<AppMessage> getMessage(){
		List<AppMessage> list = new ArrayList<AppMessage>();
        list = mapper.selectAll();
        return list;
		
	}
}
