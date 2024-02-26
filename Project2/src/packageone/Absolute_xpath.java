package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///Users/samlee.panda/Downloads/learningHTML1.html");
		driver.findElement(By.xpath("(html/body/input)[1]")).sendKeys("Samlee Panda");
		driver.findElement(By.xpath("(html/body/input)[2]")).sendKeys("ending with e");
		driver.findElement(By.xpath("(html/body/input)[3]")).sendKeys("samlee@543");
		driver.findElement(By.xpath("(html/body/form/input)[1]")).sendKeys("Samlee");
		driver.findElement(By.xpath("(((html/body/form)[2])/input)[1]")).click();
		driver.findElement(By.xpath("(((html/body/form)[2])/input)[2]")).click();
		driver.findElement(By.xpath("(((html/body/form)[2])/input)[3]")).click();
		driver.findElement(By.xpath("(html/body/input)[4]")).click();
		driver.findElement(By.xpath("(html/body/input)[5]")).click();
		driver.findElement(By.xpath("(html/body/input)[6]")).click();
		
		
	}

}
