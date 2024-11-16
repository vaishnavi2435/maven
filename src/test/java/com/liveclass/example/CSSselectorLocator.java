package com.liveclass.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorLocator {

	public static void main(String[] args) {
		
		// create a  drive session
		WebDriver driver=new ChromeDriver();
		
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get the app addressed
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		// Email= tagname-id
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("vaishuhabare123@gmail.com");
		
		//password= tagname with attribute 
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Sid@2061");
		
		//log in=tagname with class name
		driver.findElement(By.cssSelector("input.btn")).click();

	}

}
