package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class RelativeXpath_assignment {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("samleepanda123@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("samleepanda123");
		driver.findElement(By.xpath("//input[@name='login]")).click();
	}

}
