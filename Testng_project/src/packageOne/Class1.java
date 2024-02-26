package packageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1 
{
 @Test
 public void method()
 {
	 ChromeDriver driver= new ChromeDriver();
		driver.get("file:///Users/samlee.panda/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement disable=	driver.findElement(By.id("121"));
	boolean a=	disable.isEnabled();
	if(a==true && disable.isDisplayed()==true)
	{
		disable.sendKeys("samlee123");
	}
	else
	{
		System.out.println("component is disabled");
	}

 }

}
