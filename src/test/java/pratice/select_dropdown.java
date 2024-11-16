package pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class select_dropdown {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver() ;
		 driver.get("https://mail.rediff.com./cgi-bin/login.cgi");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']")).click();
		 //dropdown day
		WebElement day= driver.findElement(By.xpath("//option[text()='Month']"));
		
		 Select sc=new Select(day);
		 
		 
		List<WebElement>dd= sc.getOptions();
		System.out.println("number of day :"+dd.size());
		  for(WebElement i:dd)
		  {
			  System.out.println(i.getText());
		  }
  }
}
