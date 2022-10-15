package com.junittest.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		CalculatorApplication c = new CalculatorApplication();
		int result = c.add(15, 20);
		if (result == 35) {
			System.out.println("Correct!");
		} else {
			throw new RuntimeException("Incorrect!");
		}

		int result2 = c.add(15, -20);
		if (result2 == -5) {
			System.out.println("Correct!");
		} else {
			throw new RuntimeException("Incorrect!");
		}
	}
}
