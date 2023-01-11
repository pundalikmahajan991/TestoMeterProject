package com.TestoMeter.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestoMeter.TestPages.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pimEle;
	@FindBy(xpath = "//h5[text()='Employee Information']")
	private WebElement employInformationEle;
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addEmployLinkEle;
	@FindBy(xpath = "//h6[text()='Add Employee']")
	private WebElement addEmployEle;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public ViewEmployListPage clickOnPimEle() throws InterruptedException
	{    Thread.sleep(3);
		 pimEle.click();
		 return new ViewEmployListPage();
		
     }
	public boolean empolyInformationIsDisplay()
	{
		return employInformationEle.isDisplayed();
	}
	public AddEmployPage clickOnAddEmployLink() throws InterruptedException
	{   Thread.sleep(3);
		addEmployLinkEle.click();
		return new AddEmployPage();
	}
	public boolean addEmployIsDisplay()
	{
	  return	addEmployEle.isDisplayed();
	}
}


