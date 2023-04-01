package com.sl.utill;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sl.testBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//---------obj repo.-----------------
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement add_to_cart;
	
	
	
	//---------action method-------------
		public void clickAddToCart() 
	{
		add_to_cart.click();

	}
		
	public void scroll(String daimension)
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript(daimension);
	}
	public static  void screenshot(String filename) 
	 {
		 try 
		 {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String path="C:\\Users\\ARUN\\eclipse-workspace\\SwagLabs\\Screenshot";
			File des =new File(path+filename+".png");
			FileHandler.copy(src, des);
		 } 
		 catch (IOException e)
		 {
			 System.out.println("IO Execuotion  - file not found");
			e.printStackTrace();
		}
	
	 }
}
