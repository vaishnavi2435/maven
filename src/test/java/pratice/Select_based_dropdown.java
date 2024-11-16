package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_based_dropdown {
  @Test
  public void f()
  {
	  WebDriver driver=new ChromeDriver ();
	  driver.get("https://www.amazon.in/");
	  
	  //select based dropdown
	 WebElement dd=driver.findElement(By.id("searchDropdownBox"));
	  Select sc=new Select(dd);
	  sc.selectByIndex(4);
	  sc.selectByVisibleText("Baby");
	  sc.selectByValue("search-alias=amazon-pharmacy");
	  
	 List<WebElement >alloption= sc.getOptions();
	 System.out.println(alloption.size());
	  String exp="Baby";
	 for(WebElement i:alloption)
	 {
		 System.out.println(i.getText());
		 if(i.getText().contains(exp))
		 {
			 System.out.println("page found on the app ");
			 i.click();
			 break;
		 }
	 }
  }
}
