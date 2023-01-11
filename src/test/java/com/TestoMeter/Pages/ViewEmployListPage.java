package com.TestoMeter.Pages;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TestoMeter.TestPages.TestBase;

public class ViewEmployListPage extends TestBase {
	@FindBy(xpath="(//input[contains(@placeholder,'Type for hints')])[1]")
	private WebElement EmployNameEle;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButtonEle;
	@FindBy(xpath="(//div[@class='data'])[1]")
	private WebElement recodeFoundEle;
	@FindBy(xpath="(//i[@class='oxd-icon bi-pencil-fill'])[2]")
	private WebElement editEle;
	@FindBy(xpath="//h6[text()='Personal Details']")
	private WebElement personalDetailEle;
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement deleteButtonEle;
	@FindBy(xpath="//button[text()=' Yes, Delete ']")
	private WebElement yesAndDeleteEle;
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement addbuttonEle;
	@FindBy(xpath="//button[@type='button']")
	private WebElement buttonELe;
	
	
	public ViewEmployListPage ()
	{
		PageFactory.initElements(driver,this);
	}
	
    public void sendEmployName() throws InterruptedException
    {
    	EmployNameEle.sendKeys("dipak Mahajan");
    	Thread.sleep(5);
    }
    public void clickOnSearchButton()
    {
    	searchButtonEle.click();
    	JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
    }
    
    public EmployListPage clickOnEdit()
    {
    	editEle.click();
    	return new EmployListPage();
    
    }
    public boolean veryFiRecordGetDiaplay()
    {
    	return personalDetailEle.isDisplayed();
    }
    
   
	
	public void clickOnDeleButton() throws InterruptedException
    {   JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(0,500)");
         Thread.sleep(10);
    	deleteButtonEle.click();
    	Thread.sleep(10);
    }
    public void clickOnYesAndDeleButton()
    {
    	yesAndDeleteEle.click();
    }
    public boolean addIsDisplay() throws InterruptedException
    {   
    	Thread.sleep(10);
    	return addbuttonEle.isDisplayed();
    }
    
    public void deleteMultipleRecord() throws InterruptedException
    {   
    	List<WebElement>allEle=buttonELe.findElements(By.xpath("//button[@type='button']//i[@class='oxd-icon bi-trash']"));
    	System.out.println(allEle.size());
    	
    	for(WebElement ele : allEle)
    	{
    		ele.click();
    		yesAndDeleteEle.click();
    		
    	}
    	
    }
    
  
    
    
}

