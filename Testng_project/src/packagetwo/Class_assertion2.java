package packagetwo;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_assertion2 
{

	@Test
	public void testmethod() {
	EdgeDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("ap_email")).                                                               sendKeys("");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).                                                              sendKeys("");
	driver.findElement(By.id("signInSubmit")).click();
	
	}
	
}
