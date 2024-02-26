package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Keyfunctionality2 {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sampanda57@gmail.com");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
	    driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");

	}

}
