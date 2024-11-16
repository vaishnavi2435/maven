package com.testng.live_class_example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_operator_2 {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
  WebElement ele=    driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
      
      //create a object 
      Actions act=new Actions(driver);
      act.doubleClick(ele).perform();
      
      //handle alert
   Alert al=   driver.switchTo().alert();
   System.out.println(al.getText());
   al.accept();
  }
}
