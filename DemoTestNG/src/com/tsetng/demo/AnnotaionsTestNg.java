package com.tsetng.demo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotaionsTestNg {
	
	
	@Test
	public void TC() {
		Reporter.log("Actuel TC", true);

	}

	

	@BeforeMethod
	public void third() {

		Reporter.log("open the application", true);

	}
	@BeforeSuite
	public void MytCs() {

		Reporter.log("DB connection", true);

	}
	@AfterSuite
	public void MytCsw() {

		Reporter.log("DB connection close", true);

	}
	@AfterMethod
	public void tcm() {

		Reporter.log("close the application", true);

	}
	@AfterClass
	public void tcmr() {

		Reporter.log("close the browser", true);

	}
	@BeforeClass
	public void tcml() {

		Reporter.log("open the browser", true);

	}



}
