package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=	driver.findElement(By.id("drag7"));
		WebElement drop=	driver.findElement(By.id("div2"));
		Actions a1= new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		WebElement a=	driver.findElement(By.id("div2"));
		WebElement b=	driver.findElement(By.id("drag7"));
		Actions a2= new Actions(driver);
		a2.dragAndDrop(a, b).perform();
		
		

	}

}
