package com.pratice.TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class POM_BaseClass 
{
	
	public WebDriver driver;
	public POM_LoginPage pm;
	@BeforeClass()
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		  pm=new  POM_LoginPage(driver);
	}

}
