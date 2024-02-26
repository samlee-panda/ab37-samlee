package packagetwo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_testng2 
{
	@Test(dataProvider="data2")
	public void method1(String email)
	{
		System.out.println(email.concat(" is email id"));
	}
	@DataProvider(name="data2")
	public  Object[][] method2()
	{
		return new Object[][] {{"sam@123"},{"ram@345"}};
		
	}
	
	

}
