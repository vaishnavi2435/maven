package pratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_pratice 
{
	public static void screenshot(WebDriver driver,String name)
	{
	//WebDriver driver = new ChromeDriver();
	//driver.get("https://www.youtube.com/");
	TakesScreenshot  ts= (TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(System.getProperty("user.dir")+"//screenshot"+name+System.currentTimeMillis()+".png");
	try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) 
	{
		
		e.printStackTrace();
	}

}
}