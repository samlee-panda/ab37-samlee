package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Howtohandlewindowspopup {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement select_file=	driver.findElement(By.id("Resume"));
		select_file.sendKeys("/Users/samlee.panda/Desktop/abc.pdf");

	}

}
