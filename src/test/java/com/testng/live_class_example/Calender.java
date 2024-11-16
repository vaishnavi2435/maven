package com.testng.live_class_example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {
  @Test
  public void calender()
  {
	  WebDriver driver=new ChromeDriver();
	   //open the app
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //open the calender
	  driver.findElement(By.id("onwardCal")).click();
	  
	  //Expectation 
	  String month="Jan";
	  String year="2025";
	  String date="20";
	while(true)  
	{
	  //selection month
	 String text= driver.findElement(By.xpath("(//div[contains(@class ,'DayNavigator__Icon')])[2]")).getText();
	  System.out.println(text);
	  
	  //current month
	 String currentmonth= text.split(" ")[0];
	 System.out.println(currentmonth);
	   
	 System.out.println("***********************************************");
	String currentyear=  text.split(" ")[1];
	System.out.println(currentyear);
	
	//condition
	if(currentmonth.contains(month) && currentyear.contains(year))
	{
		break;
	}else
	{
		driver.findElement(By.xpath("(//div[contains(@class ,'DayNavigator__Icon')])[3]")).click();
	}
	
	
	}
	
	//date selection
	
	List<WebElement> alldate=driver.findElements(By.xpath("(//div[contains(@class,'DayTilesWrapper__RowWrap-sc-19')])//span"));
	System.out.println(alldate.size());
	for(WebElement i:alldate)
	{
		if(i.getText().contains(date))
		{
			i.click();
			break;
		}
	}
  }
}
