package com.pratice.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessBrowse
{

	public static void main(String[] args)
	{
		
		ChromeOptions c1= new ChromeOptions();
		c1.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(c1);
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("java");
				
		List<WebElement >s1=driver.findElements(By.xpath("(//div[@class='mkHrUc'])[1]//ul//li"));
		
		System.out.println(s1.size());
		for(WebElement i:s1)
		{
			System.out.println(i.getText());
		}
	}
}
