package packageone;

import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser {

	public static void main(String[] args) {
		EdgeDriver e1= new EdgeDriver();
		e1.get("https://www.selenium.dev");
		System.out.println(e1.getTitle());

	}

}
