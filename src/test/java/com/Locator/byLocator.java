package com.Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byLocator {

	public static void main(String[] args) {
		// create  a drive session 
		WebDriver driver =new ChromeDriver();
		
		//google
		driver.get("https://www.amazon.in/");
		
		//locator 
		 By ele=By.id("twotabsearchtextbox");
				 
		 driver.findElement(ele);
		WebElement searchbox=	ele.findElement(driver);
		
		//validation
		System.out.println(searchbox.isDisplayed());
		System.out.println("is searchbox enable:"+searchbox.isEnabled());
		searchbox.sendKeys("bag",Keys.ENTER);
		
		
		
		

	}

}
