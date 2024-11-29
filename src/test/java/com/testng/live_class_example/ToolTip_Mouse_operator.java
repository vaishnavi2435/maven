package com.testng.live_class_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pratice.screenshot_pratice.Utility.Utility_Screenshot;

public class ToolTip_Mouse_operator {
  @Test
  public void f()
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://jqueryui.com/tooltip/");
	  
	  //Handle the frame 
	  driver.switchTo().frame(0);
	  
	  WebElement ele=driver.findElement(By.id("age"));
	  
	  //performs the actions 
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  Utility_Screenshot. utility(driver, "ToolTip_Mouse_operator");
	  
	String text=  driver.findElement(By.className("ui-helper-hidden-accessible")).getText();
	System.out.println(text);
	  
	  
  }
}
