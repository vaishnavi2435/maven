package com.liveclass.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) {
		//create a session 
		WebDriver driver=new ChromeDriver ();
		
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get the app addressed
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username-using xpath
          driver.findElement(By.xpath( " // input [@ name='username']")).sendKeys("Admin");
          
          //password -using x-path
          driver.findElement(By.xpath( "  // input[@fdprocessedid='6mi73o']")).sendKeys("admin123");
          
          //register-using xpath
          driver.findElement(By.xpath("     // button [ @fdprocessedid='a5jqq']")).click();
	}

}
