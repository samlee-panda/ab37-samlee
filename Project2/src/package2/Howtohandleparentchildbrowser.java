package package2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Howtohandleparentchildbrowser {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		WebElement select=	driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]"));
		select.click();
		Set<String> selectedshoe=	driver.getWindowHandles();
		System.out.println(selectedshoe);
		Iterator<String> pcid=	selectedshoe.iterator();
	String parentid=	pcid.next();
	String childid=	pcid.next();
	driver.switchTo().window(childid);
	driver.findElement(By.id("add-to-cart-button")).click();
		

	}

}
