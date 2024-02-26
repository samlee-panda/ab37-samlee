package package2;

import org.openqa.selenium.chrome.ChromeDriver;


public class Javascript_popup {

	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		//driver.manage().window().maximize();
		driver.switchTo().alert().accept();//this will help to handle the javascript exception
		driver.manage().window().maximize();
	System.out.println(driver.getTitle());	
	
	}

}
