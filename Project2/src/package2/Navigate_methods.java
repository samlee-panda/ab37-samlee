package package2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");// another way to navigate browser
		//driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();// this method will help to navigate backward
		Thread.sleep(2000);
		driver.navigate().forward();//this method will help to navigate forward
		Thread.sleep(2000);
		driver.navigate().refresh();//this method will help to refresh the page

	}

}
