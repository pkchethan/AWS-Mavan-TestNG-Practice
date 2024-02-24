package com.practice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalc2 {
	@Test
	public void testAdd() {
		int a = 50;
		int b = 50;
		int actSum = a + b;
		int expSum = 40;
		assertEquals(actSum, expSum);
	}

	@BeforeMethod
	public void beforeTest() {
		System.out.println("before");
	}

	@AfterMethod
	public void AfterTestMethod() {
		System.out.println("Aftre");
	}

}
