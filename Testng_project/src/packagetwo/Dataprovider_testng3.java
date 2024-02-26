package packagetwo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_testng3 
{

	@Test(dataProvider="data1")
	public void method1(double b)
	{
		System.out.println(b);
	}
	@DataProvider(name="data1")
	public Object[][]method2()
	{
		return new Object[][] {{345.5}} ;
		
	}
}
