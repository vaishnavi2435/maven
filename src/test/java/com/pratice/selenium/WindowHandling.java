package com.pratice.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/popup.php");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  String parent=driver.getWindowHandle();
	  System.out.println("parent id is:"+parent);
	  
	  //next page
	  driver.findElement(By.tagName("a")).click();
	  
	  Set<String >child=driver.getWindowHandles();
	  System.out.println("child id is:"+child);
	  
	  for(String s:child)
	  {
		  if(!parent .equals(s))
		  {
			  driver.switchTo().window(s);
			  driver.findElement(By.name("emailid")).sendKeys("vaishuhabare123@gmail.com");
			  driver.findElement(By.name("btnLogin")).click();
		  }else
		  {
			  driver.switchTo().window(parent);
		  }
	  }

	}

}
