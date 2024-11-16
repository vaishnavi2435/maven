package com.Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dropdown_Select {
  @Test
  public void select()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  
	  //all link on page 
	List<WebElement>link=  driver.findElements(By.tagName("a"));
	  System.out.println("all link :"+link.size());
	  
	  for (WebElement i:link)
	  {
		  System.out.println(i.getText());
		  
	  }
	  
  }
}
