package packageOne;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class3 
{

	 @Test
	 public void method3()
	 {
		 EdgeDriver driver= new EdgeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText("Gma")).click();
	 }
}
