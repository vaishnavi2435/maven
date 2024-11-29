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

public class fullpagescreenshot {
  @Test
  public void fullp() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://github.com/pazone/ashot");
	  
	  
	  screenshot_pratice sh= new AShot()
			  .shootingStrategy(ShootingStrategies.viewportPasting(100))
			  .takeScreenshot(driver);
			 
	  //des 
	  File f1=new File(System.getProperty("user.dir")+"//Screenshot_Pratice//GitHubFullPage"+System.currentTimeMillis()+".png");
	  
	  try {
		ImageIO.write(sh.getImage(), "PNG", f1);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	  
	  
  }
}
