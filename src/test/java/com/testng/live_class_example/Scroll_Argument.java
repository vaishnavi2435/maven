package com.testng.live_class_example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Scroll_Argument {
	
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  JavascriptExecutor j=(JavascriptExecutor) driver;
	WebElement ele=  driver.findElement(By.xpath("(//ol[@class='a-carousel'])[3]"));
	
	//WebElement ele=driver.findElement(By.xpath("//a[@class='action-button']//span"));
	  j.executeScript("arguments[0].scrollIntoView(true);", ele);
	  
	  
	  
	  
	  
  }
}
