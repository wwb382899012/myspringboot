package com.wwb.demo.controller;

import org.slf4j.LoggerFactory;

import com.wwb.demo.RestApplication;

import ch.qos.logback.classic.Logger;

public class BaseController {
	
	protected Logger logger = (Logger) LoggerFactory.getLogger(RestApplication.class);
	
}
