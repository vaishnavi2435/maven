package com.testng.live_class_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider_Action {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/");
	  
	  //frame handling
	  driver.switchTo().frame(0);
	  
	  
	WebElement ele=  driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ')]"));
	
	//action on performs
	Actions act=new Actions(driver);
	act.clickAndHold(ele).moveToElement(ele, 200, 0).build().perform();
  }
}
