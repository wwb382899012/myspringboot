package com.wwb.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wwb.demo.json.RespJson;

@RestControllerAdvice
public class JsonExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler(value= Exception.class)
	public RespJson defaultErrorHandler(HttpServletRequest request,Exception e) throws Exception{
		
		e.printStackTrace();
		
		return RespJson.error(e.getMessage());
	}
}
