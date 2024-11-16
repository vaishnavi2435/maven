package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragANDdrop {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  
	  //inspect drag
	  driver.switchTo().frame(0);
	  
	 WebElement ele= driver.findElement(By.id("draggable"));
	  //drop inspect
	 WebElement ele2=driver.findElement(By.id("droppable"));
	 
	 
	 //perform actions
	 Actions act=new Actions(driver);
	 act.dragAndDrop(ele, ele2).perform();
	  
  }
}
