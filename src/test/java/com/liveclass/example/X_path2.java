package com.liveclass.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path2 {

	public static void main(String[] args) {
		// create a driver session
		 WebDriver driver=new ChromeDriver();
		 
		 //get the app 
		 driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		 
		 //email-xpath
		 driver.findElement(By.xpath(   "// input[@name='email']")).sendKeys("vaishuhabare123@gmail.com");
		 
		 //password
		 driver.findElement(By.xpath("  // input[@id='input-password']")).sendKeys("Sid@2061");
		 
		 //log in
		 driver.findElement(By.xpath("   //input[@value='Login']")).click();
		 

	}

}
