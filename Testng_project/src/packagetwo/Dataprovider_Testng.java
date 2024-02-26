package packagetwo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Testng 
{
	@Test(dataProvider="data1")
	public void method1_for_addition(int a)
	{
		System.out.println(a+100);
	}
	@DataProvider(name= "data1")
	public Object[][] method1()
	{
		return new Object[][] {{100},{200},{300},{400},{500}};
		
	}

}
