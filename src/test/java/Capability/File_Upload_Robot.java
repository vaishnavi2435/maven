package Capability;

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

public class File_Upload_Robot {
  @Test
  public void f() throws AWTException
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	WebElement choose=  driver.findElement(By.id("file-upload"));
	
	
	//performs an action 
	Actions act=new Actions (driver);
	act.click(choose).perform();
	
	//robot class
	Robot rb=new Robot();
	rb.delay(5000);
	
	//clipboard Step.....>>>ctr+c
	StringSelection sc=new StringSelection("C:\\Users\\Vaish\\Downloads\\selenium-server-4.25.0.jar");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
	
	
	//control+V......
	
	//Key press 
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	//key realesed
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	//Key enter
	rb.keyPress(KeyEvent.VK_ENTER);
	//rb.keyRelease(KeyEvent.VK_ENTER);
	
	//upload
	driver.findElement(By.id("file-submit")).click();
	
	
	
	  
  }
}
