package com.liveclass.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		// create a driver session 
		WebDriver driver= new ChromeDriver ();
		
		//adress the app
		driver.get("https://automationplayground.com/back-office/pages/login.html");
		//Email id
		driver.findElement(By.name("email")).sendKeys("vaishuhabare123@gmail.com");
		
		//password
		driver.findElement(By.name("password")).sendKeys("Sid@2061");
		
		
		//checkbox
		driver.findElement(By.name("remember")).click();
		
		//login
         driver.findElement(By.linkText("Login")).click();
	}

}
