package com.testng.live_class_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic_Authentication {
  @Test
  public void basicAuthentication() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	String text=  driver.findElement(By.tagName("p")).getText();
	
	System.out.println(text);
  }
}
