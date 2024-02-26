package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_assignment 
{
public static void main(String[] args) 
{
	ChromeDriver c1= new ChromeDriver();
	c1.get("https://grotechminds.com/registration/");
	WebElement tf=c1.findElement(By.name("fname"));
	tf.sendKeys("samlee");
	WebElement tf2=c1.findElement(By.name("lname"));
	tf2.sendKeys("panda");
	WebElement tf3=c1.findElement(By.name("Username"));
	tf3.sendKeys("Samlee panda");
	WebElement tf4=c1.findElement(By.name("password"));
	tf4.sendKeys("Samlee");
	WebElement tf5=c1.findElement(By.name("Male"));
	tf5.click();
	WebElement tf6=c1.findElement(By.name("FeMale"));
	tf6.click();
	WebElement tf7=c1.findElement(By.name("w3review"));
	tf7.sendKeys("Rotterdam");
	WebElement tf8=c1.findElement(By.id("Address"));
	tf8.sendKeys("India");
	WebElement tf9=c1.findElement(By.name("Pincode"));
	tf9.sendKeys("3029AD");
	WebElement tf10=c1.findElement(By.name("Agree"));
	tf10.click();
	
	
}
}

