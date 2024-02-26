package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInktext_program2 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://whatsupindia.nl/");
		driver.findElement(By.linkText("About Us")).click();
	}

}
