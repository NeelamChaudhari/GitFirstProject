package com.opencard.qa.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.opencard.qa.Factory.DriverFactory;
import com.opencard.qa.pages.LoginPage;

public class BaseTest {
	 WebDriver driver;
	 DriverFactory df;
	protected  LoginPage loginpage;
	
	@BeforeTest	
	public void setup()
	{
		df=new DriverFactory();
		driver=df.initDriver("chrome");
		loginpage=new LoginPage(driver);
		
		
	}
	@AfterTest
	public void tearDown()
	{
		if(driver != null)
		{
			driver.quit();
		}
	}
	

}
