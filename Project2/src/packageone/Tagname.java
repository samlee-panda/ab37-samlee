package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) 
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("file:///Users/samlee.panda/Downloads/learningHTML1.html");
	driver.findElement(By.tagName("a")).click();//tag name should be unique to use it with findelement

	}

}
