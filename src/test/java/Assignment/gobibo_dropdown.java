package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class gobibo_dropdown {
  @Test
  public void testdropdown()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.goibibo.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //popup 
	  driver .findElement(By.xpath("//span[contains(@class,'sc-jlZhew')]")).click();
	  
	  driver.findElement(By.xpath("//div[@style='width: 260px;']")).click();
	  
	  driver.findElement(By.xpath("   //input[@type='text']")).sendKeys("p");
	  
	List<WebElement> ele= driver.findElements(By.xpath(" //ul[@class='sc-12foipm-27 fOrNYO']//li//p[@class='sc-12foipm-34 cNjjrh']"));
	
	System.out.println("total number of option :"+ele.size());
	
	for(WebElement i:ele)
	{
		System.out.println(i.getText());
		
		if(i.getText().contains("pune"))
		{
			
			i.click();
			break;
		}
		
	}
	System.out.println("****************************************************");
	
	WebElement go=driver.findElement(By.className("sc-12foipm-6 erPfRs"));
	go.sendKeys("m");
	Select s2=new Select(go);
	List<WebElement> rr=s2.getOptions();
	System.out.println("all option are :"+rr.size());
	
	for(WebElement a:rr)
	{
		System.out.println(a.getText());
		
		if(a.getText().contains("mumbai"))
		{
			a.click();
			break;
		}
	}
	
		
	
  }
}
