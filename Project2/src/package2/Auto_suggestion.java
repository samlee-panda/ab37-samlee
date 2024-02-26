package package2;
import java.util.List;

//launch google type india and select the 4th option
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto_suggestion {

	public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver= new EdgeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement sb= driver.findElement(By.name("q"));
	sb.sendKeys("india");
	Thread.sleep(10000);
	List<WebElement> results=driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)[4]"));
	int counting_auto=results.size();
	
	System.out.println(counting_auto);
	results.get(1).click();//.get is the abstract method which is present in the list of webelement interface


	}

}
