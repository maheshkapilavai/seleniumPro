package com.tsetng.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityTests {

	@Test(priority = 1,enabled = false)
	public void myfirst() {
		Reporter.log("Good moring", true);
	}
	@Test
    public void testMethod() {
		boolean someCondition = true ;
	
        if (someCondition) {
            throw new SkipException("Skipping this test ");
        }
	}

	@Test(priority = 2)
	public void mySec() {
		Reporter.log("Good Afternoon", true);
	}

	@Test(priority = 3)
	public void myThrird() {
		Reporter.log("Good Evining", true);

	}

}
