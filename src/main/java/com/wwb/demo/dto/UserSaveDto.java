package com.wwb.demo.dto;

import javax.validation.constraints.NotNull;

public class UserSaveDto {

	private Integer id;
	@NotNull(message="姓名不能为空")
	private String name;
	@NotNull(message="密码不能为空")
	private String pwd;
	@NotNull(message="年龄不能为空")
	private Integer age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
