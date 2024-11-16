package com.TestnNG.DataRead__Xml;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Read_Data_xml {
	@Parameters({"un" ,"psw"})
  @Test
  public void readdata(String un,String psw)
  {
	  System.out.println("username is :"+un);
	  System.out.println("password is :"+psw);
	  
	  WebDriver driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard/index"));
	  System.out.println("*******login is complete*************************");
  }
}
