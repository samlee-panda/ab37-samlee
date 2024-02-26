package packageone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_assignment 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
	WebElement dd=	driver.findElement(By.id("Skills"));
	Select s1= new Select(dd);
	s1.selectByValue("select1");
	List<WebElement> a=s1.getOptions();
	System.out.println(a.size());
	WebElement dd1=	driver.findElement(By.id("Country"));
	Select s2= new Select(dd1);
	s2.selectByVisibleText("India ");
	WebElement dd3=	driver.findElement(By.id("Relegion"));
	Select s3=new Select(dd3);
	s3.selectByIndex(1);
	
	
	}
	

}
