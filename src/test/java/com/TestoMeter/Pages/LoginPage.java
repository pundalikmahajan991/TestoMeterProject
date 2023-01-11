package com.TestoMeter.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestoMeter.TestPages.TestBase;

public class LoginPage extends TestBase {
	
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userEle;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passEle;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginEle;
	@FindBy(xpath = "//p[text() ='Time at Work']")
    private WebElement timeAtELe;
	
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	public String veryfyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void  sendUserName() throws InterruptedException
	
	{ 
	     Thread.sleep(5);
		userEle.sendKeys("admin");
		
	}
  public void sendPassward()
  {
		passEle.sendKeys("admin123");
  }
  public HomePage clickOnLoginButton()
  {
	    loginEle.click();
	    return new HomePage();
  }
  public boolean timeIsDisplay()
  {
	   return  timeAtELe.isDisplayed();
  }
	 
	
	
	}


