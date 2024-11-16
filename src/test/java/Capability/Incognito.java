package Capability;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Incognito {
  @Test
  public void f() 
  {
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--incognito ⊗	");
	  
	  WebDriver driver =new ChromeDriver(option);
	  driver.get("https://www.amazon.in/");
  }
}
