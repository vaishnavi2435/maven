package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_Select {
  @Test
  public void selectdropdowb() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php");
	WebElement day=   driver.findElement(By.id("day"));
	  //select option 
	  Select sc= new Select (day);
	List<WebElement>option=  sc.getOptions();
	System.out.println("total day are:"+option.size());
	for(WebElement i:option)
	{
		System.out.println(i.getText());
	}
	System.out.println("***************************************");
	
WebElement month=	driver.findElement(By.id("month"));
    //select option    
      Select s1=new Select(month);
   List<WebElement> mm=  s1.getOptions();
   System.out.println("all month are :"+mm.size());
    
   for (WebElement a:mm)
   {
	   System.out.println(a.getText());
   }
   System.out.println("***************************************");
 WebElement year=  driver.findElement(By.id("year"));
 //select 
 Select s2=new Select(year);
List <WebElement > yy=s2.getOptions();
System.out.println("total year are :"+yy.size());
    
for(WebElement b:yy)
{
	System.out.println(b.getText());
}
	
  }
}
