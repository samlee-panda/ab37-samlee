package package2;
//check the given component is disabled or not
//we can do it with the help of isEnabled method
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Givencomponentisdisabledornot {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///Users/samlee.panda/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement disable=	driver.findElement(By.id("121"));
	boolean a=	disable.isEnabled();
	if(a==true && disable.isDisplayed()==true)
	{
		disable.sendKeys("samlee123");
	}
	else
	{
		System.out.println("component is disabled");
	}

	}

}
