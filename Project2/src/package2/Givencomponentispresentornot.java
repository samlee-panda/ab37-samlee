package package2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAP to check if the given component is present or not
//we can do this with the help of isdisplay method


public class Givencomponentispresentornot {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fname=	driver.findElement(By.xpath("//input[@id='fname']"));
	boolean checking_fname=	fname.isDisplayed();
	if(checking_fname==true)
	{
		fname.sendKeys("samlee");
	}
	else
	{
		System.out.println("not present");
	}
	
	}

}

