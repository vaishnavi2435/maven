package com.liveclass.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_method {

	public static void main(String[] args) {
		// create a session 
		WebDriver driver=new ChromeDriver();
		
		//get the Application
		driver.get("https://www.amazon.in/");
		
		//text()-mobile 
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//contains method-using with text
		driver.findElement(By.xpath("//span[contains(text(),' TV ')]   ")).click();
		
		//contains method -using attribute 
         	
	 WebElement ele=driver.findElement(By.xpath("//input[contains(@class,'nav-input ')][1]"));
	ele.sendKeys("bag");
	//ele.clear();
	ele.click();
	
	// Starts-with()-prefix
	driver.findElement(By.xpath("//span[starts-with(@class,'a-trun')][1]")).click();
	
		
		
		

	}

}
