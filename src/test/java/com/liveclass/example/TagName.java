package com.liveclass.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
	//create a session 
		WebDriver driver=new ChromeDriver ();
		
		//implicit 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// get adressed of app
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//number of input boxes
	List<WebElement> input=	driver.findElements(By.tagName("input"));
		System.out.println("total number of input:"+input.size());
		
		//number of images
		List <WebElement>images =driver.findElements(By.tagName("img"));
		System.out.println("total images :"+images.size());
		
		//number of links
		List<WebElement>Link=driver.findElements(By.tagName("a"));
		System.out.println("total number of links:"+Link.size());
		
		


		
		for(WebElement i:Link)
		{
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			
			
		}

	}

}
