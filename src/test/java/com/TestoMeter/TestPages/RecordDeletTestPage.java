package com.TestoMeter.TestPages;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestoMeter.Pages.HomePage;
import com.TestoMeter.Pages.LoginPage;
import com.TestoMeter.Pages.ViewEmployListPage;

public class RecordDeletTestPage extends TestBase {
	LoginPage login;
	HomePage home;
	ViewEmployListPage viewEmploy;
	
	@BeforeClass
	public void browserOpen()
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	
	@Test()
	public void veryfiRecordsGetDeleted() throws InterruptedException
	{ 
		login = new LoginPage();
		login.sendUserName();
		login.sendPassward();
		home=login.clickOnLoginButton();
	    viewEmploy =home.clickOnPimEle();
	    viewEmploy.clickOnDeleButton();
	    viewEmploy.clickOnYesAndDeleButton();
		Assert.assertTrue(viewEmploy.addIsDisplay());
	    System.out.println("record get deleted ");
	 //   viewEmploy.deleteMultipleRecord();;
	   
	}   
	 
	
 @AfterClass
	public void browserClose()
	{
		driver.close();
	}

}
