package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfacebook {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("samleepanda123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("");
		driver.findElement(By.name("login")).click();

	}

}
