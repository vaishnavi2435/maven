package com.testng.live_class_example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown_single_multiple {
  @Test
  public void dropdown() throws InterruptedException
  {
	  //create a session 
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  //drop down -selecting 
	WebElement ele=  driver.findElement(By.id("searchDropdownBox"));
	  
	  //select single item
	Select sc=new Select(ele);
	sc.selectByIndex(4);
	
	Thread.sleep(2000);
	sc.selectByValue("search-alias=beauty");
	
	Thread.sleep(2000);
	sc.selectByVisibleText("Car & Motorbike");
	
	//get the all options 
	 List<WebElement> alloption=sc.getOptions();
	 System.out.println("all the options is :"+alloption.size());
	  for(WebElement i:alloption)
	  {
		  System.out.println(i.getText());
		  //validate 
		  if(i.getText().contains("Baby"))
		  {
			  System.out.println("found the option");
			  i.click();
			  break;
		  }
	  }
	 
	
	  
  }
}
