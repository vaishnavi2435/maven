package pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

public class Scrollbar {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	//  WebElement ele=driver.findElement(By.xpath("//h2[text()='Mobile Phones']"));
	  
	  //scroll
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	 // js.executeAsyncScript("arguments[0].scrollIntoView(true)",ele);
	  
	//  Thread.sleep(3000);
	  
	  //scroll up
	//WebElement ele2=  driver.findElement(By.xpath("//a[@aria-label='Top Offers']"));
	  //JavascriptExecutor j=(JavascriptExecutor)driver;
	 // js.executeScript("window.scrollBy(document.body.scrollHeight,0)");
	  
	  js.executeScript("window.scrollTo( document.body.scrollHeight,0)");
	String tittle=  js.executeScript(" return document.tittle").toString();
	System.out.println(tittle);
	
      
      
	  
	  
	  
	  
  }
}
