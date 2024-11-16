package pratice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popup {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.guru99.com/popup.php");
	 String p1= driver.getWindowHandle();
	 System.out.println(p1);
	 
	 driver.findElement(By.linkText("Click Here")).click();
	 
	 System.out.println("*********************************************************************");
	 
	 //next page 
	// driver.findElement(By.name("emailid")).sendKeys("test123");
	 
	Set<String> p2= driver.getWindowHandles();
	System.out.println(p2);
	
	for(String p:p2)
	{
		if(!p.equals(p1))
		{
			driver.switchTo().window(p);
			driver.findElement(By.name("emailid")).sendKeys("test123");

		}
		
	}
  }
}
