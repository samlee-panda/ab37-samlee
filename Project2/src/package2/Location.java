package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Location {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement country_cannada=		driver.findElement(By.linkText("canada"));
		
		Point location=country_cannada.getLocation();
	int x=	location.getX();
	int y=	location.getY();
	System.out.println(x);
	System.out.println(y);
	

	}

}
