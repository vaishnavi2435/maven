package com.pratice.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dataprovider_DifferentClass {
	
	
	
	
  @Test(dataProvider="info"  ,dataProviderClass=dataprovider.class)
  public void different(String em,String psw) 
  {
	  
	  WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("input-email")).sendKeys(em);
		driver.findElement(By.id("input-password")).sendKeys(psw);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("tutorialsninja"));
		System.out.println("login sucessfull>>>>>>>>>"+driver.getCurrentUrl());

  }
}
