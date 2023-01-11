package com.TestoMeter.TestPages;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestoMeter.Pages.AddEmployPage;
import com.TestoMeter.Pages.EmployListPage;
import com.TestoMeter.Pages.HomePage;
import com.TestoMeter.Pages.LoginPage;

public class AddEmployTestPage extends TestBase {
	
	LoginPage login;
	HomePage home;
	AddEmployPage addEmploy;
	EmployListPage employList;
	
	@BeforeClass
	public void browserOpen()
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test()
	public void veryfiRecodsGetSaved() throws InterruptedException
	{
		 login = new LoginPage();
		 login.sendUserName();
		 login.sendPassward();
		home= login.clickOnLoginButton();
		home.clickOnPimEle();
	  addEmploy=home.clickOnAddEmployLink();
	   Thread.sleep(3);
	    addEmploy.sendFirestName();
	    addEmploy.sendMiddleName();
	    addEmploy.sendLasetName();
	    addEmploy.sendEmployID();
	  employList =addEmploy.clickOnSaveButton();
	   Thread.sleep(3);
	Assert.assertTrue(addEmploy.PersonalDetailDisplay());
	System.out.println("recods get saved Succefully");
		
	}

	
	
	
	@AfterClass
	public void browserClose()
	{
		driver.close();
	}

}
