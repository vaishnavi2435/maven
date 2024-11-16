package pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multiple_window_Handle {
  @Test
  public void f()
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.guru99.com/popup.php");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 List <WebElement >alllink= driver.findElements(By.tagName("a"));
	 
	 System.out.println(alllink.size());
	  String exp="click Here";
	  for( WebElement i:alllink)
	  {
	  
	  if(alllink.contains(exp))
		  
	  {
		  
		  System.out.println("correct link");
		  
		  
	  }
	  }
  }
}
