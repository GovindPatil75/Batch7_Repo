package com.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest  test;
	public static void custom_sendKeys(WebElement element,String value,String fieldname) {
		try {
			if(element.isEnabled()==true) {
				element.sendKeys(value);
				test.log(Status.PASS, fieldname+"==Value Succesfully Send ==>"+value);
			
			}
				}catch(Exception e) {
					
			test.log(Status.FAIL, "Unable to send value =="+e);
		}
	 }

	public static void custom_click(WebElement element,String fieldname) {
		try {
			if(element.isDisplayed() && element.isEnabled()) {
				element.click();
				test.log(Status.PASS, "click succefully =="+fieldname);
				System.out.println("");
			}
		}catch(Exception e) {
			 test.log(Status.FAIL, "Unable to click "+e);
		}
	}
	
	public static void custom_getScroll_WebElement(WebDriver driver ,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView", element);
		
	}
	
	
	
}
