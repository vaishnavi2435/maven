package com.liveclass.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPageLINK {

	public static void main(String[] args) {
		//create a session 
		WebDriver driver=new ChromeDriver();
		
		//implicit 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get app address
		driver.get("https://www.naukri.com/");
		
		//number of link 
	List<WebElement> link=	driver.findElements(By.tagName("a"));
	System.out.println("total number of links :"+link.size());
    
	
	String exp="https://www.naukri.com/minis";
	
	for(WebElement i:link)
	
	{
		System.out.println(i.getText());
		System.out.println(i.getAttribute("href"));
		
		//validate the link available in list or not 
		//Exception handling 
		
		try {
		if(i.getAttribute("href").contains(exp))
		{
		
		System.out.println("link is avaiable in this app");
			break;
		}}
		catch(NullPointerException n)
		{
			System.out.println("Link is found ....test the pass");
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		}
	}
	}


