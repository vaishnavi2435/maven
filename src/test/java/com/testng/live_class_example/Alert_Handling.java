package com.testng.live_class_example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Handling {
  @Test
  public void alertHandling()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com./cgi-bin/login.cgi");
	  
	  driver.findElement(By.name("proceed")).click();
	  
	  //Alert Handling
	Alert al=   driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
  }
}
