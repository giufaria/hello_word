package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloWorldController {

@RestController
@RequestMapping("/hello-world")
public class helloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
}
}
