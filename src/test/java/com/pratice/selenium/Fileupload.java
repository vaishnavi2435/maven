package com.pratice.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/file-upload-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//String path="automotion testing.txt";
	WebElement ele=	driver.findElement(By.name("filename"));
	
	//ele.click();
		//driver.findElement(By.name("upload")).click();
		
		//Robot rb = new Robot(driver);
		
		Actions ac= new Actions(driver);
		ac.click(ele).perform();
		
		//robot class
		Robot rb=new Robot();
		rb.delay(5000);
		
		StringSelection sc= new StringSelection("C:\\Program Files\\Common Files\\DESIGNER");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.name("upload")).click();
		
		System.out.println("*************upload***********************");
		
		
		
		
		

	}

}
