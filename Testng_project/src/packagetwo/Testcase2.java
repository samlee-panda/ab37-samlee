package packagetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Testcase2 extends Launch_quit
{

	@Test
	public void login_search_pen_logout()
	{
		driver.findElement(By.id("atwotabsearchtextbox")).sendKeys("pen");
		driver.findElement(By.id("atwotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[3]")).click();
	}
}
