package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class number_row_cell {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/seo/page-2.html");
	  
	  //number of cell
	 int cell= driver.findElements(By.xpath("(//tbody)[2]//th")).size();
	 System.out.println(cell);
	 
	 //number of row 
	 int row=driver.findElements(By.xpath("(//tbody)[3]//tr")).size();
	 System.out.println(row);
  }
}
