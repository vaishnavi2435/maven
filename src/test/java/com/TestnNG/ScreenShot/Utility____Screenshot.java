package com.TestnNG.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility____Screenshot
{
	public static void GetScreenshot(WebDriver driver,String name)
	{
		
		
		
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		File temp=sc.getScreenshotAs(OutputType.FILE);
		File dest =new File(System.getProperty("user.dir")+"//screenshot//" +name +System.currentTimeMillis()+".Png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
	}

}
