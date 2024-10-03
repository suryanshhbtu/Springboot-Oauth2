package com.spring.OAuth2.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String home() {
		return "HomePage";
	}
	
	@GetMapping("/secured")
	public String homeSecured() {
		return "Welcome to private page";
	}
	
	
}
