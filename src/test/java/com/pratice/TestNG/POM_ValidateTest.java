package com.pratice.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class POM_ValidateTest extends POM_BaseClass 
{
  @Test(priority=1)
  public void validateDologin()
  
  {
	pm.dologin("vaishuhabare123@gmail.com", "Sid@2061"); 
	
  }
  
  
  
  @Test(priority=2)
  public void validatetittle()
  
  {  
	String tittle = pm.getTittle();
	Assert.assertTrue(tittle.contains("Account"),"title is not matching");
	System.out.println("titittle is matched........."+tittle);
	
	  
  }
  
  
  
  
  @Test(priority=3)
  public void validateurl()
  
  {
	  String url = pm.geturl();
		Assert.assertTrue(url.contains("tutorialsninja"),"url is not matching");
		System.out.println("url is matched........."+url);
				
  }
  
  
  
  @Test(priority=4)
  public void validateimg()
  
  {
	System.out.println("******************************");
	pm.img();
	  
  }
}
