package com.testng.live_class_example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Types {
  @Test
  public void alertdemo() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //click for js alert------->handle the alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	   Alert js=   driver.switchTo().alert();
	   System.out.println(js.getText());
	   js.accept();
	 String res1=  driver.findElement(By.id("result")).getText();
	 System.out.println(res1);
	 
	 Thread.sleep(2000);
	      
	  System.out.println("******************************");
	  System.out.println("******************************");
	   
	  //second alert.............>
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  Alert cancel=driver.switchTo().alert();
	  System.out.println(cancel.getText());
	  cancel.dismiss();
	  String res2=  driver.findElement(By.id("result")).getText();
		 System.out.println(res2);
		 
		  System.out.println("******************************");
		  System.out.println("******************************");
		  Thread.sleep(2000); 
		  
		  // third alert........>js prompt
		  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert ok=  driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.sendKeys("hello all to selenium");
		ok.accept();
		String res3=  driver.findElement(By.id("result")).getText();
		 System.out.println(res3);
		
		
		  
		   
		      
	  
	  
  }
}
