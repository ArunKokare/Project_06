package com.sl.utill;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sl.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) 
	{
	  System.out.println("Testcase Execution onStart "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		 System.out.println("Testcase Execution Successfully Completely"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		 System.out.println("Testcase Execution Failure "+result.getName());
		UtilClass.screenshot(result.getName()+System.currentTimeMillis());
		 System.out.println("Take Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		 System.out.println("Testcase Execution Skipped "+result.getName());
	}

	
	
	

}
