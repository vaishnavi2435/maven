package com.testng.live_class_example;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window_handling_OrangeHRM {
  @Test
  public void windowhandling() throws InterruptedException
  {
	  //create a session 
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 //
	  //parent id------Homepage
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String parent=  driver.getWindowHandle();
	System.out.println(parent);
	  
	  
	  
	  //link 
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  
	  ////child id-------nextpage
	  
	Set<String > child= driver.getWindowHandles();
	System.out.println(child);
	  
	  //email
	for(String s:child)
	{
		if(!parent.equals(s))  //parent is not equcval to child =page is on child 
		{
			//driver need to switch child page 
			driver.switchTo().window(s);
			 driver.findElement(By.name("EmailHomePage")).sendKeys("vaishuhabare123@gmail.com");
		}
		
	}
	Thread.sleep(1000);
	//parent page
	driver.switchTo().window(parent);
	
	//childpage
	
	
	  
  
  
  
  }

}
