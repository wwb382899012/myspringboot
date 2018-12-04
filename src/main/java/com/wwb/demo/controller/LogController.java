package com.wwb.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wwb.demo.dto.PersonDto;
import com.wwb.demo.json.RespJson;

@RestController
@RequestMapping("/log")
public class LogController extends BaseController{

	/**
	 * 
	 * @param dto
	 * @return
	 */
	@RequestMapping("/getLog")
	@ResponseBody
	public RespJson getLog(@RequestParam(value="id") Integer id){
		try {
			Integer a=1/0;
			return RespJson.success(id);
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("异常:{}",e.getMessage());
		}
		return null;
		
	}
	/**
	 * 
	 * @param dto
	 * @return
	 */
	@RequestMapping("/postLog")
	@ResponseBody
	public RespJson postLog(@RequestBody @Validated PersonDto dto){
		try {
			Integer a=1/0;
			return RespJson.success(dto.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("异常:{}",e.getMessage());
		}
		return null;
		
	}
}
