package com.microserviceexample.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microserviceexample.limitservice.ConfigurationClass;
import com.microserviceexample.limitservice.bean.LimitBean;

@RestController
public class LimitConfigurationController {

	@Autowired
	private ConfigurationClass config;
			
	@GetMapping("/limits")
	public LimitBean getLimitValues() {
		return new LimitBean(config.getMinimum(),config.getMaximum());
		
	}
}
