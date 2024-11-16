package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class resize {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/resizable/");
	   
	  driver.switchTo().frame(0);
	  
	WebElement ele=  driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle')][3]"));
	  
	//perform action 
	
	Actions act=new Actions(driver);
	act.moveToElement(ele).dragAndDropBy(ele, 50, 100).build().perform();
  }
}
