package com.sl.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sl.pageLayer.CartPage;
import com.sl.pageLayer.CheckoutPage;
import com.sl.pageLayer.InventoryPage;
import com.sl.pageLayer.LoginPage;
import com.sl.utill.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase { //-- alll classes object are created here publically------
	
	public static WebDriver driver;
	public static Logger logger;
	
	public LoginPage log;
	public UtilClass ut;
	public InventoryPage inv;
	public CartPage cart;
	public CheckoutPage che;
	
	@BeforeClass
	public void start()
	{
		logger=Logger.getLogger("SwagLab Automation framework");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Framework Execution Started");
	}
	@AfterClass
	public void end()
	{
		logger.info("Framework Execution Complete");
	}
	
	
	@Parameters("browser")

	@BeforeMethod
	public void setUp(String Br)
	{
		//String Br ="Chrome";
		if(Br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver(co);
		}
		else if(Br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (Br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please Provide Correct Browser");
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//-----Object repository--------------
		log = new LoginPage();
		ut = new UtilClass();
	    inv = new InventoryPage();
		cart = new CartPage();
		che = new CheckoutPage();
		
		
	}
	
//    @AfterMethod
//		public void tearDown()
//		{
//			driver.quit();
//		}

}
