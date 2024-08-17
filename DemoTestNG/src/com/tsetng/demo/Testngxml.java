package com.tsetng.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngxml {

	@Test
	public void login() {
		Reporter.log(" testing login",true);
		Assert.fail();
	}
	@Test(dependsOnMethods ="login" )
	public void logout() {
		Reporter.log(" testing logout",true);
		
	}

	

}
