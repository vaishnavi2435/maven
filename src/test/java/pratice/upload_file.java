package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class upload_file {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/upload/");
	  
	  //when type=file then it use sendkeys
	  
	  String path="C:\\Users\\Vaish\\OneDrive\\Desktop";
	  driver.findElement(By.id("uploadfile_0")).sendKeys(path);
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  driver.findElement(By.id("submitbutton")).click();

 }
}
