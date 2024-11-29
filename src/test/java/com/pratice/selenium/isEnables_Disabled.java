package com.pratice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnables_Disabled

{
	
	public static void main (String arges[])
{
	
	WebDriver driver= new ChromeDriver();

         driver.get("https://www.google.co.in/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      WebElement ele=   driver.findElement(By.linkText("Gmail"));
    Boolean abc=  ele.isDisplayed();
    Boolean xyz=ele.isEnabled();
    System.out.println(xyz);
    System.out.println(abc);
}
}