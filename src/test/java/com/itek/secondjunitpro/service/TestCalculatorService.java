package com.itek.secondjunitpro.service;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculatorService {

	private CalculatorService calculatorService;
	
	@BeforeEach()
	public void setup() {
		calculatorService = new CalculatorServiceImpl();
	}

	@Test
	public void addTest() {
		assertEquals(10, calculatorService.add(7.0, 3.0));
	}

	@Test
	public void multiplyTest() {
		assertEquals(8, calculatorService.multiply(2.0, 4.0));
	}
}
