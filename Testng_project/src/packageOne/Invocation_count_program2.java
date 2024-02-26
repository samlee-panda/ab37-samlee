package packageOne;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invocation_count_program2 
{
	@BeforeMethod
	public void ant()
	{
		System.out.println("bf");
	}
	@AfterMethod
	public void ant2()
	{
		System.out.println("af");
	}
	@Test(invocationCount=11)
	public void vcas1()
	{
		System.out.println("tc1");
	}
	@Test
	public void vcas2()
	{
		System.out.println("tc2");
	}
	@Test
	public void vcas3()
	{
		System.out.println("tc3");
	}
	@Test
	public void vcas4()
	{
		System.out.println("tc4");
	}
	

}
