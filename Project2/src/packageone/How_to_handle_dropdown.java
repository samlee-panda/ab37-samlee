package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class How_to_handle_dropdown {
//the default tag name of any dropdown is select
	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		Select s1= new Select(dd);
		//s1.selectByValue("search-alias=amazon-pharmacy");
		//s1.selectByVisibleText("Books");
		s1.selectByIndex(1);
		
	}

}
