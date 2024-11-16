package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class All_options_console {
  @Test
  public void f() 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://demo.guru99.com/V4/");
	  driver.findElement(By.xpath("(//a)[4]")).click();
	  
	  //list 
	List<WebElement> list=  driver.findElements(By.xpath("(//ul[@class='dropdown-menu'])[1]//li"));
	System.out.println(list.size());
	
	for(WebElement i:list)
	{
	System.out.println(	i.getText());
	
	if(i.getText().contains("Flash Movie Demo"))
	{
		i.click();
		break;
	}
	}
  }
  
}
