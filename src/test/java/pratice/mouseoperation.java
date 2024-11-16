package pratice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseoperation {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement ele= driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //perform an actions 
	  Actions act=new Actions(driver);
	  act.contextClick(ele).perform();
	  
	  //click on cut 
	  driver.findElement(By.xpath("(//span)[3]")).click();
	  
	  //alert handle 
	 Alert alt= driver.switchTo().alert();
	 System.out.println(alt.getText());
	 alt.accept();
	 
	 //
	List <WebElement> all=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	for(WebElement i:all)
	{
		System.out.println(i.getText());
	}
	 
	  
	  
	  
  }
}
