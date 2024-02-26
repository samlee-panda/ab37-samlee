package packagetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Testcase3 extends Launch_quit
{
	@Test
	public void login_search_pen_whishlist_logout()
	{
		driver.findElement(By.id("atwotabsearchtextbox")).sendKeys("pen");
		driver.findElement(By.id("atwotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[3]")).click();
		driver.findElement(By.id("add-to-wishlist-button-submit")).click();
		
	}
}
