package packagetwo;

public class Static_Method_Inside_Main_Method 
{

	static void add() 
	{
		System.out.println("1");
	}
	public static void main(String[] args)
	{
		System.out.println("2");
		System.out.println("3");
		add();
		sub();
	//we can call one method multiple time	sub();
		print();
	

	}
	static void print()
	{
		System.out.println("4");
	}
	static void sub()
	{
		System.out.println("5");
	}
}
