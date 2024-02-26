package package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto_suggestion_amazon {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement mouse=	driver.findElement(By.id("twotabsearchtextbox"));
		mouse.sendKeys("mouse");
		Thread.sleep(4000);
		List<WebElement> t2=	driver.findElements(By.xpath("(//div[@class='left-pane-results-container']/div)[6]"));
		t2.get(5).click();
	}

}
