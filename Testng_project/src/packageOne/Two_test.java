package packageOne;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Two_test 
{
	@BeforeMethod
	public void test()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void test2()
	{
		System.out.println("after method");
	}
	
	@Test
	public void xyz()
	{
		System.out.println("test");
	}
	@Test
	public void samlee()
	{
		System.out.println("test2");
	}
	
}
