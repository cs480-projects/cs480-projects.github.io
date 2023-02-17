package com.codacum.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/hello")
	public String Hello() {
		return "<div style='width:100%; height:60px; border-radius:6px; background-color:lightblue;margin-top:-5px; text-align:center;'><h1>Team 3JS Calculator</h1><br><div>"
				+ "Enter Operand: <input style='width:200px; height:30px; border-radius:4px;' type='text' name='op1' id='op1'>"
				+ "Enter Operator: <select  name='op' id='op'>"
				+ "<option value = '+'>+</option>"
				+ "<option value = '-'>-</option>"
				+ "<option value = '*'>*</option>"
				+ "<option value = '/'>/</option>"
				+"</select>"
				+ "Enter Second Operand: <input style='width:200px; height:30px; border-radius:4px;' type='text' name='op2' id='op2'>";
	}

}
