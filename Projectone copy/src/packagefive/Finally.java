package packagefive;

public class Finally {

	public static void main(String[] args) 
	{
		try
		{
		int a=1/0;
		}
		catch(ArithmeticException a1)
		{
			System.out.println("hi");
		}
		finally
		{
			System.out.println("I will always execute");
		}

	}

}
