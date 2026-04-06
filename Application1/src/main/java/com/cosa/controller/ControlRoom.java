package com.cosa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlRoom {
	
	@Value("${server.port}")
    private String serverPort;
	
	@GetMapping("/get-info")
	public String info() {
		return "hello from " + serverPort;
	}
	
}
