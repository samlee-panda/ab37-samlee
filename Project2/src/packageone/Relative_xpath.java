package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Relative_xpath {

	public static void main(String[] args) 
	{
		EdgeDriver e1= new EdgeDriver();
		e1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		e1.manage().window().maximize();
		e1.findElement(By.xpath("(//input)[7]")).sendKeys("samleepanda@gmail.com");
		e1.findElement(By.xpath("(//input)[10]")).click();
		

	}

}
