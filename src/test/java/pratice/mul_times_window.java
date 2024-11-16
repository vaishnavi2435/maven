package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mul_times_window {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  
	  for(int i=1;i<=10;i++)
	  {
		WebDriver win=  driver.switchTo().newWindow(WindowType.TAB);
	  win.get("https://www.orangehrm.com");
	  
	  }
  }
}
