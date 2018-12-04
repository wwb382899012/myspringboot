package com.wwb.demo.dto;

import javax.validation.constraints.NotNull;

public class PersonDto {

	@NotNull(message="id不能为空")
	private Integer id;
	@NotNull(message="姓名不能为空")
	private String name;
	private Integer age;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+"、"+this.getAge()+"、"+this.getId();
	}
	
}
