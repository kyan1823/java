package com.kyan.demo03;

import static org.junit.Assert.*;

import org.junit.Test;



public class CalculatorTest {
	
	@Test
	public void testAdd() {
		assertEquals(8.5,new Calculator().add(5,3.5),0.0001);
	}

	@Test
	public void testSubtract() {
		assertEquals(1.5,new Calculator().subtract(5,3.5),0.001);
	}

	@Test
	public void testMultiply() {
		assertEquals(17.5,new Calculator().multiply(5,3.5),0.001);
	}

	@Test
	public void testDivide() {
		assertEquals(5,new Calculator().divide(17.5,3.5),0.001);
	}
	
	

}
