package pratice.POM_ByLocator;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base_Class_SwagLab

{
	public WebDriver driver;
	public login_page_SwagLab lp;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		lp=new login_page_SwagLab(driver);
	}
	

}
