package com.TestoMeter.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TestoMeter.TestPages.TestBase;

public class EmployListPage extends TestBase {
	@FindBy(xpath="//h6[text() = 'dipak mahajan']")
	private WebElement saveFistRecordsEle;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement nickNameEle;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[4]")
	private WebElement driverLicenNo;
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement saveButton;
	
	public  EmployListPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String veryfiFistRecodSaveName() throws InterruptedException
	
	{    
		  WebDriverWait wait = new WebDriverWait(driver,20);
		    WebElement saveFistRecordsEle  = wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//h6[text() = 'dipak mahajan']"))));
		  return saveFistRecordsEle.getText();
	}
	
	public void sendNickName()
	{
		nickNameEle.sendKeys("sonu");
	}
	public void sendDriverLacenNo()
	{
		 driverLicenNo.sendKeys("1223");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,500)");
	}
	public void clickOnSaveButton() throws InterruptedException
	{  
		 WebDriverWait wait = new WebDriverWait(driver,5);
		 WebElement  saveButton = wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("(//button[@type='submit'])[1]"))));
		saveButton.click();
	}
	public String getNickName() throws InterruptedException
	{   Thread.sleep(10);
		return nickNameEle.getText();
	}
	public String getDiverLacenNo() throws InterruptedException
	{    
		Thread.sleep(10);
		return driverLicenNo.getText();
	}

   

	
}
