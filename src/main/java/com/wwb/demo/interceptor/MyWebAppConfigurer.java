package com.wwb.demo.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

	/**
	 * 多个拦截器组成一个拦截器链
	 * addPathPatterns 用于添加拦截规则
	 * excludePathPatterns 用户排除拦截
	 */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    
    	System.out.println("拦截器开始执行，必须先登录才能访问首页");
        
    	//打开注释，即开始执行拦截器
    	registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/login","/doLogin");
       
        super.addInterceptors(registry);
    }

}

