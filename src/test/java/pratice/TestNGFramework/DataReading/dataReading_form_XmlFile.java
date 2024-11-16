package pratice.TestNGFramework.DataReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataReading_form_XmlFile 
{
	@Parameters({"un" ,"psw"})
  @Test
  public void xmlFile(String un,String psw)
  {
	  System.out.println("user name is :"+un);
	  System.out.println("password is :" +psw);
	  
	 WebDriver driver=new ChromeDriver () ;
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	 
	 driver.findElement(By.name("username")).sendKeys(un);
	 driver.findElement(By.name("password")).sendKeys(psw);
	 driver.findElement(By.xpath("//button [@type='submit']")).click();
	 System.out.println("***********login complete *************************");
	 
  }
}
