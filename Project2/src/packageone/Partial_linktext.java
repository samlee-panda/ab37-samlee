package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class Partial_linktext {

	public static void main(String[] args) 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Gma")).click();

	}

}
