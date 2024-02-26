package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Keyfunctionality_assignmnent {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		for(int i=0;i<=11;i++)
		{
		WebElement search=driver.findElement(By.id("searchDropdownBox"));
		Thread.sleep(2000);
		search.sendKeys(Keys.DOWN);
		}
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("software");
		//driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
	}
}
