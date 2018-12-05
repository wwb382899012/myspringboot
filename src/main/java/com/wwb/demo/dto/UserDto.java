package com.wwb.demo.dto;

import javax.validation.constraints.NotNull;

public class UserDto {

	@NotNull(message="账号不能为空")
	private Integer username;
	@NotNull(message="密码不能为空")
	private String pwd;
	
	
	public Integer getUsername() {
		return username;
	}
	public void setUsername(Integer username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
