package packagetwo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_2parameter 
{

	@Test(dataProvider="testdata")
	public void login_to_facebook(String un, String pwd)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		

	}
	@DataProvider(name="testdata")
	public Object[][] dataforlogin()
	{
		Object[][] d1=	new Object[2][2];
		d1[0][0]="ram@gmail.com";//user name
		d1[0][1]="ram";//password
		d1[1][0]="sita@gmail.com";
		d1[1][1]="sita";
		return d1;
		
	}
}
