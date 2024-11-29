package com.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	public void OnTestStart(ITestResult result)
	{
		System.out.println("test case Startes !!!!!"+result.getName());
	}
	
	
	public void OnTestSucess(ITestResult result)
	{
		System.out.println("test case Sucess !!!!!"+result.getName());
	}
	
	
	public void OnTestSkip(ITestResult result)
	{
		System.out.println("test case Skip !!!!!"+result.getName());
	}
	
	
	public void OnTestFailure(ITestResult result)
	{
		System.out.println("test case fail !!!!!"+result.getName());
	}

}
