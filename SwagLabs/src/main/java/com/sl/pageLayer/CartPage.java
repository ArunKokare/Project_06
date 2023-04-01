package com.sl.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.testBase.TestBase;

public class CartPage extends TestBase{
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------obj-------------------------------
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continue_shopping_btn;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	
	
	
	//--------------action method-----------------
	public  void clickOnContinueShoppiing()
	{
		continue_shopping_btn.click();
	}
	
	public  void clickOnCheckOut()
	{
		checkout.click();
	}
	
	
}
