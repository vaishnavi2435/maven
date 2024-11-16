package com.TestnNG.ScreenShot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPage_Screenshot {
  @Test
  public void fullpage() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	 Screenshot shot= new AShot()
	  .shootingStrategy(ShootingStrategies.viewportPasting(100))
	  .takeScreenshot(driver);
	 
	 
	 //destionation
	 File dest =new File(System.getProperty("user.dir")+"//screenshot//amazonfullpage"+System.currentTimeMillis()+".Png");
	 
	 
	 try {
		ImageIO.write(shot.getImage(),"PNG.", dest);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}