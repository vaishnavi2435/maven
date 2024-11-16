package com.testng.live_class_example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  //scroll>>>>>>>>>>
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollTo(0,6000)");
	 
	 Thread.sleep(4000);
	 js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	 
	 
	 Thread.sleep(4000);
	 js.executeScript("window.scrollTo(0,60000)");
	 
	 Thread.sleep(4000);
	 js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

	 
	 

	 
	 
	  
  }
  
}
