package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class Controller { 	
	@GetMapping("/tobi")
    public String home() { 
        return "Wow Tobi made something appear in a browser";
    } 
}
