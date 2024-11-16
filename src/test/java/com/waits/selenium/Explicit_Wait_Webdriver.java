package com.waits.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit_Wait_Webdriver {
  @Test
  public void Webdriverwait()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locater
	 By ele= By.name("email");
	  By ele2=By.name("password");
	  By ele3=By.xpath("//input[@type='submit']");
	  
	  //wait for 5sec email id visible in dom then pass email
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement email= wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
	 email.sendKeys("vaishuhabare123@gmail.com");
	 
	 //wait for 5 sec password  are present in Dom the pass the password 
	 WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement pass= wait2.until(ExpectedConditions.presenceOfElementLocated(ele2));
	pass.sendKeys("Sid@2061");
	
	
	//wait for 5 sec password  are present in Dom the click the button
	WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement btn=wait3.until(ExpectedConditions.visibilityOfElementLocated(ele3));
	btn.click();
	
	
	  
	  
  }
}
