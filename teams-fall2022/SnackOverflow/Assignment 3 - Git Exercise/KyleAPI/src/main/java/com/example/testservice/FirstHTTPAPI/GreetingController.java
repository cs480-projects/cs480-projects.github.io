
/* Name: Kyle Tam
 * Team: Snack Overflow
 * Professor Yu Sun
 * Date: 10/4/2022
 */

/* Can be run with the URL http://localhost:8080/greeting
   This will print the default message "Hello, World! Thank you for visiting!" 
   alongside the number of times a user has visited the URL.
   "World" can be changed to something else by adjusting the URL to
   http://localhost:8080/greeting?name=[TEXT_HERE], like 
   http://localhost:8080/greeting?name=Kyle
*/
package com.example.testservice.FirstHTTPAPI;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class GreetingController 
{
	private static final String template = "Hello, %s! Thank you for visiting.";
	private final AtomicLong counter = new AtomicLong();

	public static void main(String[] args) 
	{
		SpringApplication.run(GreetingController.class, args);
	}
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) 
	{
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
