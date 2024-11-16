package com.liveclass.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_AND_OR_INDEX {

	public static void main(String[] args) {
		// create a driver  session 
		WebDriver driver=new ChromeDriver();
		
		//get the app 
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vaishnavi");
	
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Birajdar");
		
		//Index
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("vaishuhabare123@gmail.com");
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("786432890");
		

	}

}
