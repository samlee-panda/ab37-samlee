package packagetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1 extends Launch_quit
{
	@Test
	public void login_search_logout()
	{
		driver.findElement(By.id("atwotabsearchtextbox")).sendKeys("shoe");
		driver.findElement(By.id("atwotabsearchtextbox")).sendKeys(Keys.ENTER);
		
	}

}
