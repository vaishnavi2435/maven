package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window_handlind {
  @Test
  public void f()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  
  for(int i=1;i<=6;i++)
  {
	 WebDriver tab= driver.switchTo().newWindow(WindowType.WINDOW);
	 tab.get("https://www.facebook.com");
	  
  }
  
  





  }
}
