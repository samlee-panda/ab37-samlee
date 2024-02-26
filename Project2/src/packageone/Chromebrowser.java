package packageone;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.flipkart.com");
		//System.out.println(c1.getWindowHandle());
	String a=	c1.getTitle();
		System.out.println(a);
	String title[]=	a.split(" ");
	System.out.println(Arrays.toString(title));
	System.out.println(title[0]);
		

	}

}
