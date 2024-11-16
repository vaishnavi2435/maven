package pratice.Screenshot.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Screenshot 


{
	public static void utility(WebDriver driver,String name)
	{
	
	TakesScreenshot  sc= (TakesScreenshot) driver;
	 File tem= sc.getScreenshotAs(OutputType.FILE);
	 File des= new File(System.getProperty("user.dir")+"//Screenshot_Pratice//"+name+System.currentTimeMillis()+".png");
	 
	 try {
		FileHandler .copy(tem, des);
	}
	 
	 catch (IOException e)
	 
	 {
		
		e.printStackTrace();
	}
	 
	}

	

}
