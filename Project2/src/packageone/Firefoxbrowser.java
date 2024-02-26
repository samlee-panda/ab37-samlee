package packageone;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver f1= new FirefoxDriver();
		f1.get("https://whatsupindia.nl");
		Thread.sleep(2000);
		f1.close();

	}

}
