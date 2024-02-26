package packageFour;

 class Parent2 
{
	static void add()
	{
		System.out.println("Addition");
	}
}

	class Son2 extends Parent2 
	{
		static void samlee()
		{
			System.out.println("samlee");
		}
	}

public class Daughter2 extends Parent2
{
	static void sub()
	{
		int a=5;
		int b=3;
		int sub= a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) 
	{
		sub();
		add();
	

	}
}


