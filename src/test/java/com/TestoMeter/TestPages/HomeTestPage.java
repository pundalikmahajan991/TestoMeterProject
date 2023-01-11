package com.TestoMeter.TestPages;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestoMeter.Pages.AddEmployPage;
import com.TestoMeter.Pages.HomePage;
import com.TestoMeter.Pages.LoginPage;

public class HomeTestPage extends TestBase {
	 LoginPage login;
	 HomePage home;
	 AddEmployPage addEmploy;
	
	@BeforeClass
	public void openBrowser()
	{
		
      
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void verfyempolyInformationIsDisplay() throws InterruptedException
	{    Thread.sleep(3);
	    login = new LoginPage();
		login.sendUserName();
		login.sendPassward();
		home=login.clickOnLoginButton();
		Thread.sleep(3);
	    home.clickOnPimEle();
	    Assert.assertTrue(home.empolyInformationIsDisplay());
	}
	@Test(priority =2)
	public void veryfiAddEmplyTextIsDisplay() throws InterruptedException
	{
		addEmploy=home.clickOnAddEmployLink();
		Assert.assertTrue(home.addEmployIsDisplay());
		System.out.println("addEploy Text is display");
	
	}
	
	@AfterClass
	public void browserClose()
	{
		driver.close();
	}

}
