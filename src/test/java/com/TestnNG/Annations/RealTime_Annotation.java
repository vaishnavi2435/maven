package com.TestnNG.Annations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class RealTime_Annotation {
	WebDriver driver;
	@BeforeClass
	public void browsersetup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
	}
	
	
  @Test(priority=1,description="smoke test")
  public void signinlink()
  {
	 driver.findElement(By.id("SignIn")).click();
	 System.out.println("******sign in complete*************");
  }
  
  @Test(priority=2,description="function test",dependsOnMethods="signinlink")
  public void login()
  
  {
	  driver.findElement(By.id("email-id")).sendKeys("vaishuhabare123@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Sid@2061");
	  driver.findElement(By.id("submit-id")).click();
	  System.out.println("**************login in complete**********************");
  }
  
  @BeforeMethod
  public  void applicationTittle()
  {
	  System.out.println("APplication tittle is :::"+driver.getTitle());
  }
  
  @AfterMethod
  public void geturl()
  {
	  System.out.println("current page url is :::"+driver.getCurrentUrl());
  }
  
  @AfterClass
  public void teardown()
  {
	  driver.quit();
  }
  
  
}
