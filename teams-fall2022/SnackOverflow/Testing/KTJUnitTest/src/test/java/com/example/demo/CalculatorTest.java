package com.example.demo;

import org.junit.*;

public class CalculatorTest 
{
	private Calculator calculator;
	
	@Before
	public void setupCalc()
	{
		System.out.println("Setting up calculator...");
		calculator = new Calculator();
	}
	
	@After
	public void finishTest()
	{
		System.out.println("Tests are complete.");
	}
	
	@Test
	public void testAddCaseOne()
	{
		int result = calculator.add(5, 20);
		Assert.assertEquals(25, result);
	}
	
	@Test
	public void testAddCaseTwo()
	{
		int result = calculator.add(-3, -10);
		Assert.assertEquals(-13, result);
	}
	
	@Test
	public void testSubtractCaseOne()
	{
		int result = calculator.subtract(10, 10);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void testSubtractCaseTwo()
	{
		int result = calculator.subtract(5, 20);
		Assert.assertEquals(-15, result);
	}
	
	@Test
	public void testMultiplyCaseOne()
	{
		int result = calculator.multiply(5, 20);
		Assert.assertEquals(100, result);
	}
	
	@Test
	public void testMultiplyCaseTwo()
	{
		int result = calculator.multiply(-3, -10);
		Assert.assertEquals(30, result);
	}
	
	@Test
	public void testDivideCaseOne()
	{
		int result = calculator.divide(120, 20);
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void testDivideCaseTwo()
	{
		int result = calculator.divide(-45, 5);
		Assert.assertEquals(-9, result);
	}
}
