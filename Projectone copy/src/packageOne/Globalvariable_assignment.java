package packageOne;

public class Globalvariable_assignment 
{
	static int a;
	static int b;
	static void substarct()
	{
		a=10;
		b=5;
		int sub=a-b;
		System.out.println(sub);
	}
	static void add()
	{
		a=5;
		b=20;
		int add=a+b;
		System.out.println(add);
	}
	public static void main(String[] args) 
	{
		substarct();
		add();
		
		
	}

}
