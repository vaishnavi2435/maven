package com.pratice.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_LoginPage
{
	
	public WebDriver driver;
	
	public  POM_LoginPage(WebDriver driver)
	{
		this. driver=driver;
	}
	
	
	//By Locator
	
	By email =By. id("input-email");
	By psw=By.id("input-password");
	By lgnbtn=By.xpath("//input[@type='submit']");
	By img=By.xpath("(//div[@id='top-links']//ul)[1]//li");
	
	//perform an action
	
	public void dologin(String em,String pass)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(psw).sendKeys(pass);
		driver.findElement(lgnbtn).click();
	
	}
	
	public String getTittle()
	{
		 return driver.getTitle();
	}
	
	public String geturl()
	{
		return  driver.getCurrentUrl();
	}
	
	public void img()
	{
		List<WebElement>imf=driver.findElements(img) ;
		System.out.println(imf.size());
		
		for(WebElement i:imf)
		{
			System.out.println(i);
		}
	}

}
