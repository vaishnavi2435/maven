package com.pratice.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
	driver.findElement(By.name("cusid")).sendKeys("vaishu");
driver.findElement(By.name("submit")).click();

        String abc=   driver.switchTo().alert().getText();
           System.out.println(abc);
           
              driver.switchTo().alert().accept();
              
            String aa = driver.switchTo().alert().getText();
            System.out.println(aa);
            driver.switchTo().alert().accept();

           
              
	}

}
