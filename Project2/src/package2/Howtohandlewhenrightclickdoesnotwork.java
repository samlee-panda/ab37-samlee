package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtohandlewhenrightclickdoesnotwork {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login=	driver.findElement(By.xpath("//a[.='CONTINUE TO LOGIN'][1]"));
		login.click();
		driver.findElement(By.id("username")).sendKeys("samlee");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("label2")).sendKeys("samlee");
		driver.switchTo().alert().accept();
		//driver.findElement(By.id("loginCaptchaValue")).sendKeys("123");
		//driver.switchTo().alert().accept();

	}

}
