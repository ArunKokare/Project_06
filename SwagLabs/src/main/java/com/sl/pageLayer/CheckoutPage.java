package com.sl.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.testBase.TestBase;

public class CheckoutPage extends TestBase {
	
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------Obj repository-----------
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement Fname;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement Lname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement pin;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement con;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menu;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement lout;
	
	
	//--------action method------------
	
	public void enterFirstName(String name)
	{
		Fname.sendKeys(name);
	}
	
	public void enterLastName(String name)
	{
		Lname.sendKeys(name);
	}
	
	public void enterPinCode(String name)
	{
		pin.sendKeys(name);
	}
	public void clickOnContinue()
	{
		con.click();
	}
	
	public void ClickOnFinish()
	{
		finish.click();	
	}
	
	public void clickOnMenu()
	{
		menu.click();
		
	}
	
	public void clickOnLogOut()
	{
		lout.click();
	}
	

}
