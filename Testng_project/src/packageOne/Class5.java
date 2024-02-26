package packageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class5 
{

	 @Test
	 public void method5()
	 {
		 ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement googlesearchtextfield=	driver.findElement(By.name("q"));
			//the return type of find element is webelement 
			googlesearchtextfield.sendKeys("india");
			googlesearchtextfield.sendKeys(Keys.ENTER);
	 }
}
