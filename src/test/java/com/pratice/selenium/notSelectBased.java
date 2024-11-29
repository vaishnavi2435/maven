package com.pratice.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class notSelectBased 
{
	
	public static void main (String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/railways");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele=	driver.findElement(By.id("src"));
	ele.sendKeys("New Delhi");
		
	List<WebElement>option=	driver.findElements(By.xpath("//div[@class='src_search_wrapper']//div[@class='stn_name_code_wrap']//div"));
	//List <WebElement>option=	driver.findElements(By.xpath("//div[@class='src_search_wrapper']//div[@class='stn_name_code_wrap']"));
	System.out.println(option.size());
	System.out.println("********************************************");
	
	for(WebElement a:option)
	{
		System.out.println(a.getText());
	}
	
	
	WebElement aa=driver.findElement(By.id("dst"));
	aa.sendKeys("Kalyan Jn");
	
	
	
	}

}
