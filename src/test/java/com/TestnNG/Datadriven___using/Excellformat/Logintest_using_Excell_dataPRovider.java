package com.TestnNG.Datadriven___using.Excellformat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Logintest_using_Excell_dataPRovider {
	@ Test(dataProvider="ExcellData",dataProviderClass=Data_driven_Excell.class )
  public void excelldataprovider(String un,String psw) 
  {
	 
	  
	  
		  
		 WebDriver driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.findElement(By.name("username")).sendKeys(un);
		  driver.findElement(By.name("password")).sendKeys(psw);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		 // Assert.assertTrue(driver.getCurrentUrl().contains("dashboard/index"));
		  System.out.println("*******login is complete*************************");
	  }
	
	  
  
}
