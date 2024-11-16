package com.webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsercommand {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://web.whatsapp.com/");
	System.out.println("title is :"+driver.getTitle());
	
	System.out.println("current url is:"+driver.getCurrentUrl());
	
	
	driver.quit();

	}

}
