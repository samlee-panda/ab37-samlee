package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Hoverover_program2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement fashion=	driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		Actions s1= new Actions(driver);
		s1.moveToElement(fashion).perform();
		WebElement shirt=	driver.findElement(By.linkText("Men's T-Shirts"));
		shirt.click();

	}

}
