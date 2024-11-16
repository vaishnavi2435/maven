package com.liveclass.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Parent_child_Ancestor {

	public static void main(String[] args) {
		// create a session 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/back-office/pages/tables.html");
		
		//ancestor 
	String ele=	driver.findElement(By.xpath("//td[text()='Mark'][1]//ancestor::tbody[1]")).getTagName();
    System.out.println("ancestor:"+ele);
    
    //parent
    String ele2=driver.findElement(By.xpath("//td[text()='Mark'][1]//parent::tr[1]")).getTagName();
    System.out.println("parent :"+ele2);
	}
	
	//

}
