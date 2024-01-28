package com.practice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalc {
	@Test
	public void testAdd() {
		int a = 20;
		int b = 20;
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
