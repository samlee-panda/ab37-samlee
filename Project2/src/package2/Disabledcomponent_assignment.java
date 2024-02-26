package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabledcomponent_assignment {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///Users/samlee.panda/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement disable=	driver.findElement(By.id("121"));
	disable.sendKeys("samlee");

	}

}
