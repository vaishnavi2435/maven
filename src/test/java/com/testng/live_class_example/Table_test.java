package com.testng.live_class_example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table_test {
  @Test
  public void testtable()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  System.out.println("************heading******************");
	  //get all the heading 
	List<WebElement> heading=  driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));
	System.out.println("total heading are :"+heading.size());
	
	for(WebElement i:heading)
	{
		System.out.println(i.getText());
	} System.out.println("************total numberof rows******************"); 

	
	int row= driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	System.out.println("total number of rows :"+row);
	
	System.out.println("************total numberof cell******************"); 
	 int cell= driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td")).size();
	 System.out.println("total number of cell :"+cell);
	 
		System.out.println("************row******************"); 
	List<WebElement>rr=	driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[4]//td"));
	System.out.println(rr.size());
	for(WebElement i:rr)
	{
		System.out.println(i.getText());
		
	}
	System.out.println("************************************");
	List<WebElement>cc= driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[3]"));
	System.out.println("total number od cell :"+cc.size());
	
	for(WebElement a:cc)
	{
		System.out.println(a.getText());
	}
	System.out.println("***************total price*********************");
		
	List<WebElement> pp=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[4]"));
	System.out.println(pp.size());
	for(WebElement  b:pp)
	{
		System.out.println(b.getText());
	}
	
		
  }
}
