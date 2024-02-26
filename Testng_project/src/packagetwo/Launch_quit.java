package packagetwo;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_quit 
{
	WebDriver driver;
@BeforeMethod
@Parameters("browser")
public void launch(String name_of_browser)
{
	if(name_of_browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	if(name_of_browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	if(name_of_browser.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("ap_email")).                                                               sendKeys("");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).                                                              sendKeys("");
	driver.findElement(By.id("signInSubmit")).click();
	
	
}
@AfterMethod
public void quit()
{
driver.close();
	
	
}

	
}
