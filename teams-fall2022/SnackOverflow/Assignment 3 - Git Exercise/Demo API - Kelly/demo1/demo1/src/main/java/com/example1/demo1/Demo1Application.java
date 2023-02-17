package com.example1.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gwt.thirdparty.guava.common.annotations.GwtCompatible;
import com.google.gwt.thirdparty.guava.common.base.Joiner;
import java.util.*; 

@SpringBootApplication
public class Demo1Application {
	public static void main(String[] args) {
	String[] arr = {"Harry Potter", "Hermione", "Ron", "Malfoy"};
	System.out.println("Original array: " + Arrays.toString(arr)); 

	String result = Joiner.on("...").join(arr); 
	System.out.println("Joined String: " + result); 
	
}
}