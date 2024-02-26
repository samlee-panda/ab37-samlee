package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partiallinktest_assignment {

	public static void main(String[] args) throws InterruptedException 
	{
	FirefoxDriver driver= new FirefoxDriver();
	String links[]= {"United Arab Emirates", "United Kingdom", "United States"};
	for(int i=0;i<links.length;i++)
	{
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.linkText(links[i])).click();
	}
	
	
	
	}

}
