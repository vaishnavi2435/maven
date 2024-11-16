package pratice.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class View_Screenshot {
  @Test
  public void src() throws IOException
  {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.orangehrm.com/");
	  
	  TakesScreenshot  sc= (TakesScreenshot) driver;
	 File tem= sc.getScreenshotAs(OutputType.FILE);
	 File des= new File(System.getProperty("user.dir")+"//Screenshot_Pratice//OramgeHRM"+System.currentTimeMillis()+".png");
	 
	  FileHandler .copy(tem, des);
  }
}
