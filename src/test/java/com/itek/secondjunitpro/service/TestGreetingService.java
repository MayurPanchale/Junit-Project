package com.itek.secondjunitpro.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGreetingService {

	private GreetingService gs;
	
	@BeforeAll
	public static void init() {
		System.out.println("Init.....");
	}
	
	// this will be fired before each test 
	@BeforeEach
	public void setup() {
		System.out.println("before..each..");
		this.gs = new GreetingServiceImpl();
	}

	@Test
	public void testgreet() {

		assertEquals("Welcome", gs.greet());

	}

	@Test
	public void testSayHello() {

		assertEquals("Hello", gs.sayHello());

	}

	@Test
	public void testSayHi() {

		assertEquals("Hi", gs.sayHi());

	}
	@AfterEach
	public void tearDown(){
	System.out.println("After..Each");
		this.gs=null;
	}
	
	@AfterAll
	public static void shutDown(){
		System.out.println("Shutting Down...");
	}

}
