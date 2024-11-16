package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	List<WebElement > list=  driver.findElements(By.xpath("//ul[@style='list-style-type: none;']//button"));
	
	for(WebElement element:list)
	{
		for(int count=1;count<=3;count++)
		{
			 driver.switchTo().alert().accept();
			 
		
			
		}
		
	}
  }
}
