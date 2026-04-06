package com.cosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlRoom {
	@Autowired
	private IFeignClient feign;
	
	@Value("${server.port}")
    private String serverPort;
	
	@GetMapping("/get-data")
	public String info() {
		String str = feign.info().substring(0,10);
		return str + " another portNo : " + serverPort;
	}
	
}
