package com.testng.live_class_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_Window_Handle {
  @Test
  public void newwindow()
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  
	  //launching 10 times
	  for(int i=1;i<=10;i++)
	  {
	 WebDriver win= driver.switchTo().newWindow(WindowType.WINDOW);
	 win.get("https://www.facebook.com");
	  }
  }
}
