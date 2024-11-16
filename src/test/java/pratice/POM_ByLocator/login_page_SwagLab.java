package pratice.POM_ByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page_SwagLab {

 WebDriver driver;
 
 //Encapsulation = data + method 
  public login_page_SwagLab(WebDriver driver)
  {
	  this .driver=driver;
  }
  
  //Locator
   By id= By.id("user-name");
   By psw=By.id("password");
   By btn=By.id("login-button");
   
   //perform on Actions 
   public void dologin(String un,String Pass)
   {
	   driver.findElement(id).sendKeys(un);
	 
	   driver.findElement(psw).sendKeys(Pass);
	   driver.findElement(btn).click();
   }
   
   public String  geturl()
   {
	  return driver.getCurrentUrl();
   }
   
   public String getTittle()
   {
	   return driver.getTitle();
   }
	
}
