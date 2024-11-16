package com.TestnNG.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class viewPage_Screenshot {
  private static final String FileHandele = null;

@Test
  public void screenshotviewpage() throws IOException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	TakesScreenshot sc=(TakesScreenshot)driver;
	File temp=sc.getScreenshotAs(OutputType.FILE);
	File dest =new File(System.getProperty("user.dir")+"//screenshot//amazon"+System.currentTimeMillis()+".Png");
	FileHandler.copy(temp, dest);		  
  }
}
