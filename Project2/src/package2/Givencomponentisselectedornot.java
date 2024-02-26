package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Givencomponentisselectedornot {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///Users/samlee.panda/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement checkbox=	driver.findElement(By.xpath("(/html/body/input)[6]"));
		checkbox.click();
		Thread.sleep(2000);
		if(	checkbox.isSelected()==true)
		{
			System.out.println("CLick on submit button");
		}
		else
		{
			checkbox.click();
		}
	}

}
