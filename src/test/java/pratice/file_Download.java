package pratice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class file_Download {
	
	public static void main(String args[])
	{
		ChromeOptions option=new ChromeOptions();
		Map<String,Object>Prefs= new HashMap<String,Object>();
		String path="C:\\Users\\Vaish\\OneDrive\\Desktop\\maven\\Download";
		
		Prefs.put("download.default_directory", path);
		option.setExperimentalOption("Prefs", Prefs);
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://the-internet.herokuapp.com/download");
		
		driver.findElement(By.linkText("data.json")).click();
	}
	
	

}
