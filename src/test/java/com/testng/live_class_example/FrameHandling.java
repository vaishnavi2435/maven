package com.testng.live_class_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
  @Test
  public void framehandling() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ui.vision/demo/webtest/frames/");
	 int ff= driver.findElements(By.tagName("frame")).size();
	 System.out.println("total frame are :"+ff);
	 
	 
	 //frame-1-------------->index
	 driver.switchTo().frame(0);
	 driver.findElement(By.name("mytext1")).sendKeys("frame 1 handle!!!!!!!!!!!!!");
	 
	 //come to the main page 
	 driver.switchTo().defaultContent();
	 
	 //frame-2---------------->webElement
	WebElement c1= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	 driver.switchTo().frame(c1);
	 driver.findElement(By.name("mytext2")).sendKeys("frame 2 handled!!");
	 
	 //come to the main page 
	 driver.switchTo().defaultContent();
	 
	 //frame-3---------->>>webElment
	WebElement c3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(c3);
	driver.findElement(By.name("mytext3")).sendKeys("frame 3 handled!!!");
	
	//come to inner frame 
	WebElement iframe=driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(iframe);
	driver.findElement(By.xpath("(//div[@class='bzfPab wFGF8'])[2]")).click();
	
	//come to the main page 
	driver.switchTo().defaultContent();
	 
	 
	 //frame-4 ------>>>>>>>>webElement
	WebElement c2= driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	driver.switchTo().frame(c2);
	driver.findElement(By.name("mytext4")).sendKeys("frame 4 are handle!!");
	
	//come to the main page
	driver.switchTo().defaultContent();
	
	//frame-5---------->>>>index
	driver.switchTo().frame(4);
	driver.findElement(By.name("mytext5")).sendKeys("frame 5 handled!!!");
  }
}
