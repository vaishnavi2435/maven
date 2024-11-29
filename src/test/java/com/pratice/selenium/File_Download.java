package com.pratice.selenium;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Download {

	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		Map<String,Object> c=new HashMap<String ,Object>();
		String path="C://Users//Vaish//OneDrive//Desktop//maven//Download//download.file";

		c.put("download.default_directory",path);
		option.setExperimentalOption("c",c);
		
		
		
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/download/download.html");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("direct-download")).click();
		
	}

}
