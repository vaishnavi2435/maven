package com.TestnNG.ScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Using__Utility_Screenshot {
  @Test
  public void f()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
	  
	  //frame handling
	  driver.switchTo().frame("iframeResult");
	  
	  
	  //smile
	WebElement ele=  driver.findElement(By.xpath("//img[@alt='Smiley']"));
	
	//perform on actions
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	Utility____Screenshot.GetScreenshot(driver,"Using__Utility_Screenshot");
  }
}
