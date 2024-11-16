package com.TestnNG.DataRead__Xml;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.utility__File_Properties;

public class data_readXml_usingUtility {
	
	
  @Test()
  public void readdata() throws IOException 
  {
	  utility__File_Properties p=new  utility__File_Properties() ;
	  
	  WebDriver driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(p.getdata("url"));
	  driver.findElement(By.name("username")).sendKeys(p.getdata("un"));
	  driver.findElement(By.name("password")).sendKeys(p.getdata("psw"));
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard/index"));
	  System.out.println("*******login is complete*************************");
  }
}
