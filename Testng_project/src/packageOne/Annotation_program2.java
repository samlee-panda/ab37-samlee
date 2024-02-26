package packageOne;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_program2 
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
	@Test
	public void abc()
	{
		System.out.println("2nd test");
	}
	
	@AfterMethod()
	public void am()
	{
		System.out.println("after method");
	}
	@AfterClass()
	public void ac()
	{
		System.out.println("after class");
	}
	@AfterTest()
	public void at()
	{
		System.out.println("after test");
	}
	@AfterSuite()
	public void as()
	{
		System.out.println("after suite");
	}
	
}
