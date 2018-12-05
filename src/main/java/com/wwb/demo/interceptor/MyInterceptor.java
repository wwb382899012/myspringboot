package com.wwb.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wwb.demo.entity.Person;

//拦截器
public class MyInterceptor implements HandlerInterceptor{
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截器，必须先登录，才能访问首页
		
		boolean flag =true;
        String user=(String) request.getSession().getAttribute("username");
        if(null==user){
            response.sendRedirect("/login");
            flag = false;
        }else{
            flag = true;
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
    
   

}
