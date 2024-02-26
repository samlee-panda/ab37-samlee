package package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Print_linktext {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> link_count=	driver.findElements(By.tagName("a"));
	int a=	link_count.size();
	System.out.println(a);
	for(int i=0;i<=a-1;i++)
	{
		WebElement w=	link_count.get(i);
		String text_name=w.getText();//
		System.out.println(text_name);
	}

	}

}
