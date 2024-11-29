package com.pratice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args)
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// frame handling
		int frame =driver.findElements(By.xpath("//html//frame")).size();
		System.out.println("Tottal frame are :"+frame);
		
		
		//first frame 
		driver.switchTo().frame(0);
		driver.findElement(By.name("mytext1")).sendKeys("First frame Handle");
		System.out.println("First frame complete");
		
		
		driver.switchTo().defaultContent();
		
		//second frame
		WebElement ff=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(ff);
		driver.findElement(By.name("mytext2")).sendKeys("frame second Handled");
		System.out.println("second frame complete");
		//driver.close();
		
		//third frame
		driver.switchTo().defaultContent();
		WebElement f=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(f);
		
		//inner frame
		
		driver.findElement(By.name("mytext3")).sendKeys("frame third Handled");
		System.out.println("third frame complete");
	WebElement ele=	driver.findElement(By.tagName("iframe"));
	driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//label[@for='i9']")).click();
		driver.findElement(By.xpath("//span[text()='Web Testing']")).click();
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//System.out.println(driver.getTitle());
		
driver.switchTo().defaultContent();
		
		//second frame
		WebElement aaa=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(aaa);
		driver.findElement(By.name("mytext4")).sendKeys("frame fourth Handled");
		System.out.println("fourth frame complete");
		
	}

}
