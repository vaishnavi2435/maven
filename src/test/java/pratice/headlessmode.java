package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class headlessmode {
  @Test
  public void f()
  {
	//  WebDriver driver=new ChromeDriver();
	 // driver.get("https://www.amazon.in");
	  
	  //headless mode
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--incognito");
	  
	 /* WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	WebElement ele=  driver.findElement(By.id("twotabsearchtextbox"));
	ele.sendKeys("bag");
	
	//all options 
	List<WebElement >all=driver.findElements(By.xpath("//div[@class='two-pane-results-container']//span"));
	System.out.println(all.size());
	
	for(WebElement i:all)
	{
		System.out.println(i.getText());
	}
	*/
	  WebDriver driver=new ChromeDriver(option);
		  driver.get("https://www.amazon.in");
	  
  }
}
