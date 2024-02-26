package packageOne;

public class This_calling_statement 
{
	This_calling_statement()
	{
		System.out.println("constructor 1");
	}
	This_calling_statement(int a)
	{
		this(1,2,3);
		System.out.println("constructor 2");
		
	}
	This_calling_statement(int a,int b, int c)
	{
		this();
		System.out.println("constructor 3");
	}

	public static void main(String[] args) 
	{
		new This_calling_statement(1);
	}

}
