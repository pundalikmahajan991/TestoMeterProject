package com.TestoMeter.TestPages;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestoMeter.Pages.EmployListPage;
import com.TestoMeter.Pages.HomePage;
import com.TestoMeter.Pages.LoginPage;
import com.TestoMeter.Pages.ViewEmployListPage;

public class ViewEmployListTestPage extends TestBase {
	LoginPage login;
	HomePage home;
	EmployListPage employList;
	ViewEmployListPage viewEmploy;
	
	@BeforeClass
	public void browserOpen()
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test()
	public void veryfiRecodesGetFound() throws InterruptedException
	{
		login = new LoginPage();
		login.sendUserName();
		login.sendPassward();
		home=login.clickOnLoginButton();
	    viewEmploy=home.clickOnPimEle();
	   viewEmploy.sendEmployName();
	    viewEmploy.clickOnSearchButton();
		employList=viewEmploy.clickOnEdit();
	 Assert.assertTrue(viewEmploy.veryFiRecordGetDiaplay());
	  System.out.println("record get display ");
	 }
	
	
	
	
	@AfterClass
	public void browserClose()
	{
		driver.close();
	}

}
