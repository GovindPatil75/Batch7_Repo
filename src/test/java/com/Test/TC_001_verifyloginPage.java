package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class TC_001_verifyloginPage extends BaseClass{
	@Test
	public void verifyFBloginTest_Invaliddata() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_sendKeys(login.gettxt_emailid(), excel.getStringData("Sheet1", 0, 0), "Email");
		Library.custom_sendKeys(login.gettxt_password(), excel.getStringData("Sheet1", 0, 1), "Password");
		Library.custom_click(login.getbtn_login(), "Login Button");
		Assert.assertTrue(false);
		//Library.custom_getScroll(driver).executeScript("", n""ull)
	//	Library.custom_getScroll_WebElement(driver, login.getbtn_login());
		
	}
}
