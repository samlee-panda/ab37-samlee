package package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_suggestion_flipkart {

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search=	driver.findElement(By.name("q"));
		search.sendKeys("books");
		
		List<WebElement> l1=	driver.findElements(By.xpath("(//form/ul/li)[6]"));
		l1.get(5).click();
		
	}

}
