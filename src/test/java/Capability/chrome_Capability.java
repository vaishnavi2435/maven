package Capability;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chrome_Capability {
  @Test
  public void ChromeCapabilty()
  {
	  ChromeDriver driver=new ChromeDriver();
	Capabilities cap=  driver.getCapabilities();
	Map<String,Object> map=cap.asMap();
	System.out.println(map);
	
	
  }
}
