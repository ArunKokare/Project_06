package com.sl.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.testBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------obj repository-------------
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement name_txt;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass_txt;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login_btn;
	
	//-------------action method--------------
	
	public void enterName(String name)
	{
		name_txt.sendKeys(name);
	}
	
	public void enterPassword(String password)
	{
		pass_txt.sendKeys(password);
	}
	
	public void clickLogin()
	{
		login_btn.click();
	}

}
