package com.testng.live_class_example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dropdown_Redbus {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //Dropdown
	WebElement ele=  driver.findElement(By.id("src"));
	ele.sendKeys("pune");
	
List <WebElement>ele2=	driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li"));
System.out.println("total list are :"+ele2.size());
   
//get all option 
 for(WebElement i:ele2)
 {
	 System.out.println(i.getText());
	 
	 //validate 
	 if(i.getText().contains("Swargate"))
	 {
		 i.click();
		 break;
		 
	 }
 }

	
	  
  }
}
