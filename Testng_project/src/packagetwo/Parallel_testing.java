package packagetwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parallel_testing 
{
	WebDriver driver;
	@Test
	@Parameters("browser")//here you have to give the 
	public void launching_browser(String name_of_browser)
	{
		if(name_of_browser.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		if(name_of_browser.equals("firefox"))
		{
		driver=new FirefoxDriver();
		}
		if(name_of_browser.equals("edge"))
		{
		driver=new EdgeDriver();
		}
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement element=	driver.findElement(By.name("q"));
	element.sendKeys("india");
	element.sendKeys(Keys.ENTER);
	
		
	}

}
