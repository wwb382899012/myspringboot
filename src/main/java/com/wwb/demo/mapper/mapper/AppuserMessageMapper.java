package com.wwb.demo.mapper.mapper;

import java.util.List;

import com.wwb.demo.entity.AppuserMessage;
import com.wwb.demo.mapper.util.MyMapper;

public interface AppuserMessageMapper extends MyMapper<AppuserMessage> {
	List<AppuserMessage> selectAll();
}