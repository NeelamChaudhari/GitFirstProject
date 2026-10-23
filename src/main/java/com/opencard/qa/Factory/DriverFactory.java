package com.opencard.qa.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	private WebDriver driver;
 public WebDriver initDriver(String BrowserName)
 {
	 switch (BrowserName.trim().toLowerCase()) {
	case "chrome":
		driver=new ChromeDriver();
		break;
	case "edge":
		driver=new EdgeDriver();
		break;
	case "safari":
		driver=new SafariDriver();
		break;
	default:
		System.out.println("Invalid browser" +BrowserName);
		
	}
	 driver.manage().deleteAllCookies();
	 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	 return driver;
	 
	 
 }

}
