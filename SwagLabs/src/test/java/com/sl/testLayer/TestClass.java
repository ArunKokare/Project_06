package com.sl.testLayer;

import org.testng.annotations.Test;

import com.sl.pageLayer.CartPage;
import com.sl.pageLayer.CheckoutPage;
import com.sl.pageLayer.InventoryPage;
import com.sl.pageLayer.LoginPage;
import com.sl.testBase.TestBase;
import com.sl.utill.UtilClass;

public class TestClass extends TestBase {
	
	@Test()
	public void verifyBuyfunctionality () throws InterruptedException 
	{
		//---login into applicatio
		log.enterName("standard_user");
		log.enterPassword("secret_sauce");
		log.clickLogin();
		
		//-----add to card product
		inv.clickOnProduct1();
		ut.clickAddToCart();
		inv.clickCardOption();
		
		cart.clickOnContinueShoppiing();
		inv.clickOnProduct2();
		ut.clickAddToCart();
		
		//--Checkout product
		inv.clickCardOption();
		cart.clickOnCheckOut();
		
		che.enterFirstName("standard");
		che.enterLastName("user");
		che.enterPinCode("111100");
		che.clickOnContinue();
		
		ut.scroll("window.scrollBy(0,900)");
		che.ClickOnFinish();
		Thread.sleep(5000);
		
		ut.scroll("window.scrollBy(0,-900)");
		//---LogOut into application 
		che.clickOnMenu();
		che.clickOnLogOut();
		
		
		
		
		
		
	}

}
