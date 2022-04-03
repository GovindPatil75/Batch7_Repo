package com.Test;

import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class TC_002_verifyRegistration extends BaseClass{
	
	
	@Test
	public void verify_registration() {
		
		System.out.println("test");
		System.out.println(config.getStageUrl());
		System.out.println(excel.getStringData("Sheet1", 0, 0));
	}

}
