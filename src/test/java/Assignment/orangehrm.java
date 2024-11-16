package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   
	    driver.get("https://www.orangehrm.com/");
	    String title= driver.getTitle();
	    String exp="OrangeHRM";
	    if(title.equals(exp))
	    {
	    	System.out.println("title is:"+title);
	    	System.out.println("Title is match");
	    }else 
	    {
	    	System.out.println("title is not match");
	    }
	    
	    driver.quit();

	}

}