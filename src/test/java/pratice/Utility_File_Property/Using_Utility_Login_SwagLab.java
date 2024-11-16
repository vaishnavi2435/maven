package pratice.Utility_File_Property;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Using_Utility_Login_SwagLab {
  @Test
  public void FilePropertyUtility()
  {
	  
	  Utility_FileProperty p2= new  Utility_FileProperty();
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(p2.getdata("url"));
	  driver.findElement(By.id("user-name")).sendKeys(p2.getdata("un"));
	  driver.findElement(By.id("password")).sendKeys(p2.getdata("psw"));
	  driver.findElement(By.id("login-button")).click();
	  System.out.println("**********login complete************");
	  
  }
}
