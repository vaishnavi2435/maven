package com.TestnNG.Data_driven_Framework__.using_Array;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest_dataDriven {
  @Test(dataProvider="mydata",dataProviderClass=dataforDriven_Array.class  )
  public void logintest(String un,String psw) 
  {
	  
	 WebDriver driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	 // Assert.assertTrue(driver.getCurrentUrl().contains("dashboard/index"));
	  //System.out.println("*******login is complete*************************");
  }
}
