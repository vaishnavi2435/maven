package Capability;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.testng.annotations.Test;

public class Headless {
  @Test
  public void f() 
  {
	  //headless 
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--headless=old ");
	  
	  //create a session
	  WebDriver driver =new ChromeDriver (option);
	  driver.get("https://www.google.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //open the app
	 WebElement ele= driver.findElement(By.id("APjFqb"));
	 ele.sendKeys("testng");
	 
	 //all the options in console
List<WebElement>alloptions=	 driver.findElements(By.xpath("(//ul[@jsname=\"bw4e9b\"])[1]//li"));
    System.out.println("all option are :"+alloptions.size());
    
    for(WebElement i:alloptions )
    {
    	System.out.println(i.getText());
    }
	  
  }
}
