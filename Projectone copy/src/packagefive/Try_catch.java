package packagefive;

public class Try_catch {

	public static void main(String[] args) 
	{
		try
		{
		int c=1/0;
		System.out.println("samlee");
		}
	catch(ArithmeticException a1)
		{
		System.out.println("int can not store infinity");
		}

	}

}
