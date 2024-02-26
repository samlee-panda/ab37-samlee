package packageOne;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class2 
{
	 @Test
	 public void method2() throws InterruptedException
	 {
		 ChromeDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.google.com/");
			//driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
	 }

}
