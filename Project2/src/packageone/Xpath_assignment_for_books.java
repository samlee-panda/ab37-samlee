package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_assignment_for_books {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		WebElement a=	driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
		a.click();
		WebElement a2=driver.findElement(By.xpath("//span[@class='folder']"));
		a2.click();
		Thread.sleep(3000);
		WebElement a3=driver.findElement(By.xpath("(//span[@class='folder'])[16]"));
		a3.click();
		


	}

}
