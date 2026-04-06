package com.cosa.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "APPLICATION1")
public interface IFeignClient {
	
	@GetMapping("/get-info")
	public String info();
	
}
