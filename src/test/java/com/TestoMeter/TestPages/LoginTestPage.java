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

public class LoginTestPage extends TestBase{
	
	  LoginPage login;
	  HomePage homePage;
	
	@BeforeClass
	public void openBrowser()
	{
	   
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	
	  @Test(priority = 1) 
	  public void veryfyUrl()
	  {
		  login = new LoginPage();
		  String Actual = login.veryfyUrl(); 
		  String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	       Assert.assertEquals(Actual,expected);
	   }
	 
	
	@Test(priority=2)
	public void getLoginSucessfull() throws InterruptedException
	{    
		Thread.sleep(5);
		login.sendUserName();
		login.sendPassward();
		homePage =login.clickOnLoginButton();
		Assert.assertTrue(login.timeIsDisplay());
		Thread.sleep(3);
		System.out.println("user get succefullyloged");
		
	}
	
	@AfterClass
	public void browserClose()
	{
		driver.close();
	}


}
