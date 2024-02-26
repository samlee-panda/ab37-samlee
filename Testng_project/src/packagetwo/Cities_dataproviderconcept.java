package packagetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Cities_dataproviderconcept 
{

	@Test(dataProvider="list of cities")
	public void method1(String input)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys(input);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@DataProvider(name="list of cities")
	public Object[][] method1()
	{
		return new Object[][] {{"banglore"},{"kolkta"},{"odisha"},{"hydrebad"}};
		
	}
	
}
