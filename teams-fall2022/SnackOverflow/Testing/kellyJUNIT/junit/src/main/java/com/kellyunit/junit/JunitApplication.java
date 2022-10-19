package com.kellyunit.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JunitApplication {

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		//SpringApplication.run(JunitApplication.class, args);

		JunitApplication j = new JunitApplication();
		int res = j.add(15, 20); 
		
		if (res == 40) {
			System.out.println("Correct!");
		}

		else {
			throw new RuntimeException("Incorrect!"); 
		}

		int res2 = j.add(15, -25);

		if (res2 == -10) {
			System.out.println("Correct!");
		}

		else {
			throw new RuntimeException("Incorrect!"); 
		}
	}

}
