package com.wwb.demo.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//打开注释即开启定时任务
//@Component
public class TaskController {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=3000)
	public void reportCurrentDate(){
		System.out.println("现在时间："+dateFormat.format(new Date()));
	}
	
}
