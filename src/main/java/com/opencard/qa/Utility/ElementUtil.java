package com.opencard.qa.Utility;

import java.time.Duration;


import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
private WebDriver driver;
public ElementUtil(WebDriver driver)
{
	this.driver=driver;
}
public String WaitforTitleIs(String titleValue , long timeOut )
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	try
	{
		wait.until(ExpectedConditions.titleIs(titleValue));
		
	}
	catch(TimeoutException e)
	{
		System.out.println(titleValue+ " The title is");
		e.printStackTrace(); 
	}
	return driver.getTitle();
	 
}

}
