package Capability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class File_Upload_Sendkeys {
  @Test
  public void f() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  String path="C://Users//Vaish//OneDrive//Desktop//project";
	  driver.findElement(By.id("file-upload")).sendKeys(path);
	  Thread.sleep(3000);
	  driver.findElement(By.id("file-submit")).click();
	  
  }
}
