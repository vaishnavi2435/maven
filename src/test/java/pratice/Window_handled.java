package pratice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window_handled {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //home page 
	String ele=  driver.getWindowHandle();
	System.out.println(ele);
	
	System.out.println("********************************************************************");
	//next page
	//driver.findElement(By.name("EmailHomePage")).sendKeys("test@123");
Set<String >ww=	driver.getWindowHandles();
System.out.println(ww);

for(String i:ww)
{
	if(!ele.equals(i))
	{
		driver.switchTo().window(i);
		driver.findElement(By.name("EmailHomePage")).sendKeys("test@123");
	}
}
	
	
	
  }
}
