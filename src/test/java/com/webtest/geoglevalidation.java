package com.webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class geoglevalidation {

	public static void main(String[] args) {
		//create a driver session 
		WebDriver driver =new ChromeDriver();
		
		//open the geogle application url
		driver.get("https:/www.google.com");
		
		//get the title 
		 String actTittle=driver.getTitle();
          String exp="Google";
          
          //validation
          
          if(actTittle.equals(exp))
          {
        	  System.out.println("actTittle is :"+actTittle);
        	  System.out.println("Tittle is match");
          }else
          {
        	  System.out.println("Tittle is not match");
          }
          
          //close the brower 
          driver.quit();
	}

}
