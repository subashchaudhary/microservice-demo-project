package com.oncore.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceFallBackController {

	@GetMapping("/userServiceFallBack")
	
	public String userServiceFallBackMethod() {
		return "User Service is taking longer time to response. Please Try Again After Sometimes";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "Department Service is Taking Longer time to Response. Please Try Again After Sometimes";
	}
}
