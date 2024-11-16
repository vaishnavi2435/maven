package com.testng.live_class_example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender_gobibo {
  @Test
  public void calender()
  {
	  WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/");
	  
	  driver.findElement(By.xpath("//span[@class='sc-jlZhew inxprl']")).click();
	  
	 	  
	  
	  driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();
	while(true)  {
	  //expectation
	  String month="january";
	  String day="6";
	  String year="2025";
	  
	 driver.manage().window().maximize();

	  //current month
	String mm=  driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	System.out.println(mm);
	
	
	String currentmm=mm.split(" ")[0];
	System.out.println("current month is :"+currentmm);
	
	String currentyy=mm.split(" ")[1];
	System.out.println("current year is :"+currentyy);
	
	if(currentmm.contains(month) &&  currentyy.contains(year))
	{
		break;
	}else
	{
		driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
	}
	
	//date selection
	List<WebElement >dd=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[2]//div[@class='DayPicker-Day']"));
	System.out.println("total day are :"+dd.size());
	
	for(WebElement i:dd)
	{
	 if(i.getText().contains(day))
	 {
		 i.click();
		 break;
	 }
	}
	
	}		  
  }
}