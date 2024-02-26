package packagefive;

public class Access_specifier_withinclass // access specifier for methods within the class
{
	public static void add()
	{
		System.out.println("1");
	}
	private void sub() 
	{
		System.out.println("2");
	}
	protected static void div()
	{
		System.out.println("3");
	}
	void mul()
	{
		System.out.println("4");
	}
	
	public static void main(String[] args)
	{
		add();
		div();
		Access_specifier_withinclass a1= new Access_specifier_withinclass();
		a1.mul();
		a1.sub();
		

	}

}
