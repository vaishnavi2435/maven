package com.pratice.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINK_Finding
{
	
	public static void main (String args[])
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement>link=driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());
		for(WebElement a:link)
		{
			//System.out.println(a.getText());
			System.out.println(a.getAttribute("href"));
		}
		driver.quit();
	}

}
