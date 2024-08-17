package com.tsetng.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void first() {
		Reporter.log("am the first Testng", true);

	}

	@Test
	public void seond() {

		Reporter.log("My second test", true);

	}

	@Test
	public void third() {

		Reporter.log("My second third", true);

	}

}
