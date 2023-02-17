package com.codacuum.springboothelloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HellowWorldcontroller {

	@GetMapping("/hello-world")
	
	public String HelloWorld(){
		
	return "Hello World";
	}
}
