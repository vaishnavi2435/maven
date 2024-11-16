package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResgisterANDlogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("dropdown")).click();
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("vaishnavi");
        driver.findElement(By.name("lastname")).sendKeys("habare");
        driver.findElement(By.id("input-email")).sendKeys("vaishuhabare123@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("9226850187");
        driver.findElement(By.name("password")).sendKeys("Sid@2061");
        driver.findElement(By.name("confirm")).sendKeys("Sid@2061");
        
        driver.findElement(By.name("newsletter")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.className(" btn-primary")).click();
	}

}
