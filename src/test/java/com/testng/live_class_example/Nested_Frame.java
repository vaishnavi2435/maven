package com.testng.live_class_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nested_Frame {
  @Test
  public void frame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  //total frame
	 int frame= driver.findElements(By.tagName("frame")).size();
	 System.out.println("Total frame are :"+frame);
	 
	 //frame -1>>>>>>>>>>index
	 driver.switchTo().frame(0);
	 
	 //frame-1>>>>>>>>>>left frame
	 driver.switchTo().frame("frame-left");
	 System.out.println(" left frame  source  ");
	 System.out.println(driver.getPageSource());
	 
	 System.out.println("*******************************");
	 System.out.println("*******************************");
	 

	 //come to main page
	 driver.switchTo().defaultContent();
	 
	 //frame-1>>>>>>>>>>middle frame
	 driver.switchTo().frame(0).switchTo().frame("frame-middle");
	 System.out.println("middle page frame source");
	System.out.println( driver.getPageSource());
	 
	 System.out.println("*******************************");
	 System.out.println("*******************************");
	 


	//come to main page 
	driver.switchTo().defaultContent();
	
	//frame_1>>>>>>>>>>>>>>>>>>>>Right frame
	driver.switchTo().frame(0).switchTo().frame("frame-right");
	System.out.println("Right frame source ");
	System.out.println(driver.getPageSource());
	 
	 System.out.println("*******************************");
	 System.out.println("*******************************");
	 
//come to the main page 
	 driver.switchTo().defaultContent();
	 
	 //frame_2>>>>>>>>>>>>>>bottom frame
	 driver.switchTo().frame(1);
	WebElement c1= driver.findElement(By.xpath("//frame[@src='/frame_bottom']"));
	driver.switchTo().frame(c1);
	 System.out.println("Bottom frame source");
	 System.out.println(driver.getPageSource());
	 
	 

	 
  }
}
