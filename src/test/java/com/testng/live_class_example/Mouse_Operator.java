package com.testng.live_class_example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Operator {
  @Test
  public void mouseoperator()
  {
	  
	  WebDriver driver=new ChromeDriver();
	 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  WebElement ele= driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //create a object of Action class
	  Actions act=new Actions(driver);
	  act.contextClick(ele).perform();
	  
	  //get the menu and click on it 
	List<WebElement > alloption= driver.findElements(By.xpath("(//ul)[3]//li//span"));
	
	for(WebElement i:alloption)
	{
		System.out.println(i.getText());
		if(i.getText().contains("Cut"))
		{
			i.click();
			break;
		
		}
		
	}
	
	//alert handle 
	Alert alt=driver.switchTo().alert();
	System.out.println("alrt are :"+alt.getText());
	alt.accept();
	
  }
}
