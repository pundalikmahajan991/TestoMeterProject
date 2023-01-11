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

public class EmployListTestPage extends TestBase{
	LoginPage login;
	HomePage home;
	AddEmployPage addEmploy;
	EmployListPage employList;
	
	@BeforeMethod
	public void browserOpen()
	{
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void verifySaveFirstName() throws InterruptedException
	{
		login = new LoginPage();
		login.sendUserName();
		login.sendPassward();
		home=login.clickOnLoginButton();
		home.clickOnPimEle();
	addEmploy =	home.clickOnAddEmployLink();
	    addEmploy.sendFirestName();
	    addEmploy.sendMiddleName();
	    addEmploy.sendLasetName();
	    addEmploy.sendEmployID();
	   employList= addEmploy.clickOnSaveButton();
	   
	  Assert.assertEquals(employList.veryfiFistRecodSaveName(), "dipak mahajan");
	  System.out.println("1st records get save Succecfully");
	    
	}
	
	@Test(priority=2)
	public void VeryRecordsUpDated() throws InterruptedException
	{
		employList.sendNickName();
		employList.sendDriverLacenNo();;
		employList.clickOnSaveButton();
		Thread.sleep(20);
	//	Assert.assertEquals(employList.getNickName(),"sonu");
	
		System.out.println("records get updated Succecfully");
	}
	
	
	@AfterMethod
	public void browserClose()
	{
		driver.close();
	}

}
