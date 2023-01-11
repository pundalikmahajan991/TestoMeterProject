package com.TestoMeter.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TestoMeter.TestPages.TestBase;

public class AddEmployPage extends TestBase{
	@FindBy(xpath ="//input[@name='firstName']")
	private WebElement firstNameEle;
	@FindBy(xpath ="//input[@name='middleName']")
	private WebElement middleNameEle;
	@FindBy(xpath ="//input[@name='lastName']")
	private WebElement lastNameEle;
	@FindBy(xpath ="(//input[contains(@class,oxd-input )])[6]")
	private WebElement emploIdEle;
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement saveButtonEle;
	@FindBy(xpath ="//h6[text() ='Personal Details']")
	private WebElement personalDetailEle;
	
	public AddEmployPage()
	{
		PageFactory.initElements(driver, this);
	}
     
	public void sendFirestName()
	{
		firstNameEle.sendKeys("dipak");
	}
	public void sendMiddleName()
	{
		middleNameEle.sendKeys("rahul");
	}
	public void sendLasetName()
	{
		lastNameEle.sendKeys("mahajan");
	}
	public void sendEmployID()
	{
		emploIdEle.sendKeys("0266");
	}
	public EmployListPage clickOnSaveButton()
	{
		saveButtonEle.click();
		return new EmployListPage();
	}
	public boolean PersonalDetailDisplay() throws InterruptedException
	{    WebDriverWait wait = new WebDriverWait(driver,20);
	    WebElement personalDetailEle = wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//h6[text() ='Personal Details']"))));
		return personalDetailEle.isDisplayed();
	}
	
}
