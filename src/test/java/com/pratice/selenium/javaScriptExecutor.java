package com.pratice.selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class javaScriptExecutor {

	public static void  main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,4000)");
		 
		// js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//driver.quit();
		Thread.sleep(4000);
	
		 js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		 
		 js.executeScript("history.go(0)");
		//String aa= js.executeScript(" return document.tittle").toString();
		 String aa = (String) js.executeScript("return document.title");
		System.out.println(aa);
		 
		 
	}

}
