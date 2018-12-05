package com.wwb.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwb.demo.entity.User;
import com.wwb.demo.mapper.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public User getUserByNamePwd(User record){
		User user= mapper.selectOneByObj(record);
		return user;
	}
	
}
