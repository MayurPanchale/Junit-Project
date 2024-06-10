package com.itek.secondjunitpro.service;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public Double add(Double d1, Double d2) {
		
		return d1+d2;
	}

	@Override
	public Double multiply(Double d1, Double d2) {
		
		return d1*d2;
	}

}
