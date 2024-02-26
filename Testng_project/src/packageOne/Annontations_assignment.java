package packageOne;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annontations_assignment 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("before suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method");
	}
	@Test
	public void te()
	{
		System.out.println("test");
	}
}
