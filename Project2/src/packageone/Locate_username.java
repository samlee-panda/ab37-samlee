package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_username {

	public static void main(String[] args) 
	{
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://grotechminds.com/registration/");
		c1.findElement(By.id("Username")).sendKeys("samlee Panda");
		c1.findElement(By.id("lname")).sendKeys("Panda");
		c1.findElement(By.id("fname")).sendKeys("samlee");
		c1.findElement(By.id("password")).sendKeys("samlee@123");
	}

}
