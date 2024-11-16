package com.testng.live_class_example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pagination_Tabale {
  @Test
  public void tabletest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //total page
	List<WebElement> page=  driver.findElements(By.xpath("//ul[@class='pagination']//li"));
	System.out.println("toatl number of page:"+page.size());
	for(WebElement i:page)
	{
		System.out.println(i.getText());
		List<WebElement>tt=driver.findElements(By.xpath("//table[@id='productTable']//tr//td"));
		System.out.println("total table are :"+tt.size());
		for(WebElement a:tt)
		{
			System.out.print(a.getText()+" ");
		}
		System.out.println();
		
	}
	//all tabele
	//List<WebElement>tt=driver.findElements(By.xpath("//table[@id='productTable']//tr//td"));
//	System.out.println("total table are :"+tt.size());
//	for(WebElement a:tt)
//	{
//		System.out.println(a.getText());
//	}
	
	System.out.println("*****************************");
	
	driver.findElement(By.xpath("//ul[@class='pagination']//li[4]")).click();
	
	  //checkbox
	driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
  }
}
