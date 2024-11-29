package com.pratice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		
		for(int i=1;i<=10;i++)
		{
			WebDriver tab=driver.switchTo().newWindow(WindowType.WINDOW);
			tab.get("https://www.amazon.in/");
			System.out.println(driver.getTitle());
			System.out.println("**********************");
		}

	}

}
