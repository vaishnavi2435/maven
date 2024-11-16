package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse_op {
  @Test
  public void f()
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  WebElement ele=driver.findElement(By.linkText("Gmail"));
	  
	  //move to element 
	  Actions act=new Actions(driver);
	  act.click().build().perform();
  }
}
