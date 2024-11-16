package com.testng.live_class_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizeble_mouse_operator {
  @Test
  public void f() 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://jqueryui.com/resizable/");
	  
	  //Handle the frame 
	  driver.switchTo().frame(0);
	  
	  //inspect the resizeable 
	WebElement ele=  driver.findElement(By.className("ui-icon"));
	
	//perform an action
	Actions act=new Actions (driver);
	act.moveToElement(ele).dragAndDropBy(ele, 100, 50).build().perform();
  }
}
