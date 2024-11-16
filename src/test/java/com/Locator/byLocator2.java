package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byLocator2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	WebElement ele=	driver.findElement(By.id("twotabsearchtextbox"));
		
		if(ele.isDisplayed() && ele.isEnabled())
		{
			ele.sendKeys("mobile",Keys.ENTER);
		}
	}

}
