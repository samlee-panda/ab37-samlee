package packageOne;

public class Global_variable 
{
	static int a;
	

	public static void main(String[] args)
	{
		a=10;
		System.out.println(a);
		add();
		

	}
	static void add()
	{
		System.out.println(a);
	}

}
