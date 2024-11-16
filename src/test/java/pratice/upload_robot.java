package pratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class upload_robot {
  @Test
  public void f() throws AWTException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/upload/");
	 WebElement ele= driver.findElement(By.id("uploadfile_0"));
	 
	 //perform an action
	 Actions act=new Actions(driver);
	 act.contextClick(ele).perform();
	 
	 //robot
	 Robot rb=new Robot();
	 rb.delay(5000);
	 
	 //selection method
	 StringSelection sc=new StringSelection("C:\\Users\\Vaish\\OneDrive\\Desktop");
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
	 
	 
	 //control+c
	 
	 rb.keyPress(KeyEvent.VK_CONTROL);
	 rb.keyPress(KeyEvent.VK_V);
	 
	 rb.keyRelease(KeyEvent.VK_CONTROL);
	 rb.keyRelease(KeyEvent.VK_V);
	 
	 //enter
	 rb.keyPress(KeyEvent.VK_ENTER);
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  driver.findElement(By.id("submitbutton")).click();

	 
	 //
  }
}
