package com.tsetng.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCoun {

	
	/*
	 * @Test(invocationCount = 5) public void myInvo() {
	 * Reporter.log("sample Invocation report"); }
	 */
	@Test
	public void TC1() {
		Reporter.log("sample test1");
	}
	@Test
	public void TC2() {
		Reporter.log("sample test2");
		Assert.fail();
	}
}
