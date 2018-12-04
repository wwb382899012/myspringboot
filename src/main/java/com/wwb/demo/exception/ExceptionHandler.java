package com.wwb.demo.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class ExceptionHandler {
		
	private static final String ERROR_VIEW="errorAdvice";
	
	//页面跳转方式。注释，即不会生效
	
	/*@org.springframework.web.bind.annotation.ExceptionHandler(value= Exception.class)
	public Object errorHandler(HttpServletRequest request,HttpServletResponse response,Exception e) throws Exception{
		
		e.printStackTrace();
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception",e);
		mav.addObject("url",request.getRequestURI());
		mav.setViewName(ERROR_VIEW);
		return mav;
	}*/
}
