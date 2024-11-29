package com.pratice.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alloption_GET
{
	public static void main (String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.id("searchDropdownBox"));
		
		Select sc= new Select(ele);
	List <WebElement>option=	sc.getOptions();
	System.out.println("all option :"+option.size());
	
	System.out.println("****************************************************");
	
	for(WebElement a:option)
	{
		System.out.println(a.getText());
	}
	
	System.out.println("****************************************************");
	System.out.println("****************************************************");
	sc.selectByIndex(7);
	sc.selectByValue("search-alias=fashion");
	sc.selectByVisibleText("Amazon Pharmacy");
	Boolean abc=sc.isMultiple();
	System.out.println(abc);
		
	}

}
