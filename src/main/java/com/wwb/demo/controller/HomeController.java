package com.wwb.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wwb.demo.RestApplication;
import com.wwb.demo.common.RestException;
import com.wwb.demo.common.ResultCodeEnum;
import com.wwb.demo.dto.PersonDto;
import com.wwb.demo.dto.UserDto;
import com.wwb.demo.entity.Person;
import com.wwb.demo.entity.User;
import com.wwb.demo.json.RespJson;
import com.wwb.demo.service.UserService;

import ch.qos.logback.classic.Logger;



@Controller
public class HomeController extends BaseController{
	
	@Autowired UserService userSerivice;
	
	/**
	 * 首页
	 * @return
	 */
	@RequestMapping("/")
	public String index(Map<String, Object> map,HttpSession session){
		map.put("session_username", session.getAttribute("username"));
		return "index";
	}
	
	/**
	 * 登录也
	 * @return
	 */
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	/**
	 *登录页面2
	 * @return
	 */
	@RequestMapping("/login2")
	public String login2(){
		return "login2";
	}
	/**
	 * 登录处理逻辑
	 * @param dto
	 * @param session
	 * @return
	 */
	@RequestMapping("/doLogin")
	@ResponseBody
	public RespJson doLogin(@RequestBody @Validated UserDto dto, HttpSession session){
		RespJson json = RespJson.success();
		try {
			User user = new User();
			user.setName(dto.getUsername());
			user.setPwd(dto.getPwd());
			User result = userSerivice.getUserByNamePwd(user);
			
			if(result!=null){//模拟登陆成功  dto.getPwd().equals("123456")
				session.setAttribute("username", dto.getUsername());
				session.setAttribute("pwd", dto.getPwd());
				//System.out.println(session.getAttribute("user"));
				json = RespJson.success(dto);
			}else{
				json = RespJson.error("用户名或密码错误");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			throw new RestException(ResultCodeEnum.FAIL);
		}
		
		return json;
		
		
	}
	
	/**
	 * 登录处理逻辑2,和doLogin的区别在于配置属性： spring.session.store-type=redis  和 RedisSessionConfig 配置类
	 * @param dto
	 * @param session
	 * @return
	 */
	@RequestMapping("/doLogin2")
	@ResponseBody
	public RespJson doLogin2(@RequestBody @Validated UserDto dto, HttpServletRequest request){
		RespJson json = RespJson.success();
		try {
			
			if(dto.getPwd().equals("123456")){//模拟登陆成功
				HttpSession session = request.getSession();
				if(session.getAttribute("username")==null){
					session.setAttribute("username", dto.getUsername());
					session.setAttribute("pwd", dto.getPwd());
					//System.out.println(session.getAttribute("user"));
					json = RespJson.success(dto);
				}
				
			}else{
				json = RespJson.error("用户名或密码错误");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			throw new RestException(ResultCodeEnum.FAIL);
		}
		
		return json;
		
		
	}
	
	/**
	 * 退出登录
	 * @param session
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/loginOut")
	public void loginOut(HttpSession session,HttpServletResponse response) throws IOException{
		session.removeAttribute("username");
		session.removeAttribute("pwd");
		response.sendRedirect("/");
	}
	
	/**
	 * 全局异常捕获
	 * @return
	 */
	@RequestMapping("/myerror")
	public String test(){
		Integer a =1/0;
		return "error";
	}
	
	
	
	
	
}
