package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LINK_findind_Application {
  @Test
  public void linkfinding() 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.linkedin.com/jobs/search?trk=guest_homepage-basic_guest_nav_menu_jobs&position=1&pageNum=0");
	  
	  //finding all link on app
List<WebElement>alllink	=  driver.findElements(By.tagName("a"));
	System.out.println("all link are the app :"+alllink.size());
	
	for(WebElement i:alllink)
	{
		System.out.println(i.getText());
		System.out.println(i.getAttribute("href"));
	}
	//pratice.screenshot_pratice.java(driver,"ss");
	
  }
}
