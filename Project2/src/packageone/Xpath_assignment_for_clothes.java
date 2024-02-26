package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_assignment_for_clothes {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		WebElement a=	driver.findElement(By.xpath("(//span[@class='folder'])[1]"));
		a.click();
		WebElement a2=driver.findElement(By.xpath("(//span[@class='folder'])[26]"));
		a2.click();

	}

}
