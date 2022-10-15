package com.junittest.calculator;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {
	@Test
	public void testAdd() {
		CalculatorApplication c = new CalculatorApplication();
		int result = c.add(10, 25);
		Assert.assertEquals(35, result);
	}
}
