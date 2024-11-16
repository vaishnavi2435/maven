package Capability;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Filedownload {
  @Test
  public void f()
  {
	  ChromeOptions options = new ChromeOptions();         
	  Map<String, Object> prefs = new HashMap<String, Object>();
	  String path="C://Users//Vaish//OneDrive//Desktop//maven//Download";
	  prefs.put("download.default_directory",path);
	  options.setExperimentalOption("prefs", prefs);

	  
	  
	  
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.get("https://testpages.eviltester.com/styled/download/download.html");
	  driver.findElement(By.id("direct-download")).click();
  }
}
