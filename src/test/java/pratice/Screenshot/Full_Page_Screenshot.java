package pratice.Screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Full_Page_Screenshot {
  @Test
  public void fullpage()
  {
	 WebDriver driver= new ChromeDriver() ;
	 driver.get("https://www.amazon.in");
	 
	screenshot_pratice sh= new AShot()
	  .shootingStrategy(ShootingStrategies.viewportPasting(100))
	  .takeScreenshot(driver);
	 
	 //des
	 File sc=new File(System.getProperty("user.dir")+"//Screenshot_Pratice//amazonFullPage"+System.currentTimeMillis()+".png");
	 
	  try {
		ImageIO.write(sh.getImage(),"PNG",sc);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	  
  }
}
