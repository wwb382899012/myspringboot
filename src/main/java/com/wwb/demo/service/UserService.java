package com.wwb.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wwb.demo.dto.UserListDto;
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
	
	public Page<User> listPage(UserListDto dto,Integer page,Integer pageSize){
		
		Page<User> pager = PageHelper.startPage(page,pageSize);
		mapper.listPage(dto);
		return pager;
	}
	
	
	public List<User> listPage2(UserListDto dto,Integer page,Integer pageSize){
		
		PageHelper.startPage(page,pageSize);
		List<User> list = mapper.listPage(dto);
		return list;
	}
}
