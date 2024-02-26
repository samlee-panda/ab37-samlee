package packageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class4 
{
	 @Test
	 public void method4()
	 {
		 ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("samleepanda123@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("samlee@123");
			driver.findElement(By.name("login")).click();
	 }

}
