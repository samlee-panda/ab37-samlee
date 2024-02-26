package package2;
import java.util.Iterator;
//launch naukri.com click on sign in with google and do the login activity
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintonaukriclickingongoogle {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	driver.manage().window().maximize();
	WebElement click_login= driver.findElement(By.name("google-register"));
	//syntax of writing xpath for text message is - //tagname[.='textmessage']
	click_login.click();
	Set<String> parentandchild=	driver.getWindowHandles();
	System.out.println(parentandchild);
	Iterator<String> pcid=	parentandchild.iterator();//iterator method come from set interface
	//whenever we perform the iteration which do not follow indexing we use the iterator method
	String parentid1=pcid.next();//it will give the parent id from parentandchild
    String childid1=	pcid.next();//1st child id
    System.out.println(parentid1);
    System.out.println(childid1);
    driver.switchTo().window(childid1);//moved control to child browser
	WebElement username=	driver.findElement(By.id("identifierId"));
	username.sendKeys("samlee123@gmail.com");

	}

}
