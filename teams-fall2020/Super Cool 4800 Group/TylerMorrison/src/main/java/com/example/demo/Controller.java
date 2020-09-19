package com.example.demo;

import org.springframework.web.bind 
    .annotation.GetMapping; 
import org.springframework.web.bind 
    .annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind 
    .annotation.RestController; 


@RestController
public class Controller 
{ 
	
	@GetMapping("/")
    public String home() 
    { 
  
        return "<html><body><h1><a href=\"/test\">Click here</a></h1></body></html>";
    } 
	
   @RequestMapping(method = {RequestMethod.GET} , value = {"/test"})
    public String request() 
    { 
  
        return "<html>\r\n" + 
        		"    <head>\r\n" + 
        		"        <h1>Tyler Morrison A3 #3</h1>\r\n" + 
        		"    </head>\r\n" + 
        		"\r\n" + 
        		"    <body>\r\n" + 
        		"        <p>\r\n" + 
        		"            This is my attempt at making a HTTP API with Java Spring\r\n" + 
        		"        </p>\r\n" + 
        		"    </body>\r\n" + 
        		"</html>";
    } 
} 

