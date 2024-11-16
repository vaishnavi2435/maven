package com.liveclass.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Special_character {

	public static void main(String[] args) {
		//create a session 
		WebDriver driver=new ChromeDriver();
		
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get the app addressed
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email=partial match *
		 WebElement value=driver.findElement(By.cssSelector("input[id*='email']"));
		value.sendKeys("vaishuhabare123@gmail.com"); 
		
		//Password =startwith(^)-prefix 
		driver.findElement(By.cssSelector( "  input[  type ^='pass']")).sendKeys("Sid@2061");
		
		//login =endswith($)-suffixvalue 
		driver.findElement(By.cssSelector(  " input[ class$='primary']")).click();
		

	}

}
