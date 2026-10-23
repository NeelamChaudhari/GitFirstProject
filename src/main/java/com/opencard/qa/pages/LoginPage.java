package com.opencard.qa.pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opencard.qa.Utility.AppConstants;
import com.opencard.qa.Utility.ElementUtil;

public class LoginPage {
	
	private WebDriver driver;
	private ElementUtil EleUtil;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		EleUtil=new ElementUtil(driver);
	
	}
	
		  private By email=By.id("input-email");
		  private By pwd=By.id("input-password");
		  private By login=By.cssSelector("input[type='submit']");
		  private By forgotlink=By.linkText("Forgotten Password");
		  
      public String IsTitle()
      {
    	  String title=EleUtil.WaitforTitleIs(AppConstants.LOGIN_PAGE_TITLE, AppConstants.SHORT_TIME_OUT);
    	  System.out.println(title);
    	  return title;
      }
		  
		  
		  
		  
		  
}
