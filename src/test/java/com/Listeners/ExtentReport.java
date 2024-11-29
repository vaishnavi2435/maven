package com.Listeners;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig.ExtentSparkReporterConfigBuilder;

public class ExtentReport {
  @Test
  public void extentreport() 
  
  {
	  //create object of ExtentReport class
	  ExtentReports e1=new ExtentReports();
	  
	  //path of report
	  ExtentSparkReporter s1=new ExtentSparkReporter(System.getProperty("user.dir")+"//Report//AutomationReport.html");
	  
	  //configuration
	  s1.config().setDocumentTitle("this is tes case");
	  s1.config().setReportName("First sprint report");
	  s1.config().setTheme(Theme.DARK);
	  
	  
	  //attached report to extent object
	  e1.attachReporter(s1);
	  
	  
	  //generate log
	  
ExtentTest c1=e1.createTest("Test case status");
           c1.log(Status.PASS, "test case is pass!!!!!!!!!!!!!");
           c1.log(Status.INFO, "test case information!!!!!!!!!!!!!");
           c1.log(Status.SKIP, "test case is skip!!!!!!!!!!!!!");
           c1.log(Status.FAIL, "test case is fail!!!!!!!!!!!!!");
           
           
           //close Report -flush()
           e1.flush();
	  
  }
}