package com.TestoMeter.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {
	
	public static WebDriver driver;
	@BeforeSuite
	public void browserSetup()
	{   
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium1\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	
	@AfterSuite
	public  void browserTearDown()
	{   
	   driver.quit();
	}
	

}
