package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("title is :"+driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("tittle is :"+driver.getTitle());
	
		driver.navigate().back();
		
		driver.navigate().refresh();
		driver.navigate().forward();

	}

}
