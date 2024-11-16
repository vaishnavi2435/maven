package com.liveclass.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		
		// create a session 
		WebDriver driver=new ChromeDriver ();
		
         //implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get the app adressed
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//login
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		//logout
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		 
		driver.findElement(By.linkText("Logout")).click();

	}

}
