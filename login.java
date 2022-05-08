package com.myselenium.tutorials;

import org.testng.annotations.Test;

public class TestngAnnotation {
	// test case 1
	@Test(priority = 2)
	public void testCase1() {
		System.out.println("in test case 1");
		System.out.println("in test case 110");
	}

	// test case 2
	@Test(priority = 3)
	public void testCase2() {
		System.out.println("in test case 2");
	}
	// test case 2
	@Test(priority = 4)
	public void testCase4() {
		System.out.println("in test case 2");
	}
	// test case 2
	@Test(priority = 1;TestRun=enabled;Timeout=20)
	public void testCase3() {
		System.out.println("in test case 2");
	}

}
