package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Relative_xapathsyntax {

	public static void main(String[] args) {
		EdgeDriver e1= new EdgeDriver();
		e1.get("https://www.amazon.in/");
		e1.manage().window().maximize();
		e1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoe");
		e1.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		

	}

}
