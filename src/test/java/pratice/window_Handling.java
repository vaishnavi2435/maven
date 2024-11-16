package pratice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class window_Handling {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //first page 
	   //driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	   String parent=driver.getWindowHandle();
	   System.out.println( "parent window"+parent);
	  
	   //child page
	   driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  // driver.findElement(By.name("EmailHomePage")).sendKeys("test@123");
	 Set<  String >child=driver.getWindowHandles();
	 System.out.println("child window:"+child);
	 
	 for(String s1:child)
	 {
		 if(!parent.equals(s1))
			 
		 {
			 driver.switchTo().window(s1);
			// driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			 driver.findElement(By.name("EmailHomePage")).sendKeys("test@123");

		 }
	 }
	 
  }
}
