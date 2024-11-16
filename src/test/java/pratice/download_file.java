package pratice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class download_file {
  @Test
  public void f()
  {
	  ChromeOptions option=new ChromeOptions();
	  Map<String,Object> prefs=new HashMap<> ();
	  String path = "C:\\Users\\Vaish\\OneDrive\\Desktop\\core.java project\\new";
	  prefs.put("download.default_directory", path);

	 // prefs.put("download.default_directory", path);
	  option.setExperimentalOption("prefs", prefs);
	  
	  
	  WebDriver driver=new ChromeDriver(option);
	  driver.get(ccc);
	  driver.findElement(By.linkText("createExampleData.json")).click();
	  
	 // System.out.println("directory"+path);
  }
}
