package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyfunctionality_assignment2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Manish kumar Tiwari");
		for(int i=19;i>=13;i--)
		{
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		}

	}

}
