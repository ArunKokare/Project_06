package com.sl.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.testBase.TestBase;

public class InventoryPage extends TestBase{
	
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj variabls----------------
	 @FindBy(xpath="//a[@class='shopping_cart_link']")
	 private WebElement card_box;
	 
	 @FindBy(xpath="(//div[@class='inventory_item_name'])[1]")
	 private WebElement product1;
	 
	 @FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
	 private WebElement product2;
	 
	
	
	//----------action methods-------------
	 public void clickCardOption()
	 {
		 card_box.click();
	 }
	 
	 public void clickOnProduct1()
	 {
		 product1.click();
	 }
	 
	 public void clickOnProduct2()
	 {
		 product2.click(); 
	 }
}
