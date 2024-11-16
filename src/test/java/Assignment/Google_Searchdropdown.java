package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_Searchdropdown {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	List<WebElement >ele=  driver.findElements(By.xpath("//div[@class=\"navFooterVerticalColumn navAccessibility\"]//li"));
         System.out.println("all option is :"+ele.size());
         
         for(WebElement i: ele)
         {
        	 System.out.println(i.getText());
         }
  }
}
