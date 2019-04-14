package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping(value = "/getMessage")
	public String getMessage() {
		return "welcome to first Spring Boot Application";
	}
}
