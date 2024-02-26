package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element {

	public static void main(String[] args)
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
