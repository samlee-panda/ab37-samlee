package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement double_click=	driver.findElement(By.linkText("Mobiles"));
		Actions a1= new Actions(driver);
		a1.doubleClick(double_click).perform();

	}

}
