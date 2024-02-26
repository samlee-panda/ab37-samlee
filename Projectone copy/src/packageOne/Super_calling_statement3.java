package packageOne;
class one56
{
	one56(int a)
	{
		System.out.println("by");
	}
}
class two45 extends one56
{
	two45(int b)
	{ 
		super(5);
		System.out.println("by2");
	}
}
public class Super_calling_statement3 extends two45
{
	 Super_calling_statement3(int c)
	{
		super(7);
			System.out.println("byeee");
		
	}

	public static void main(String[] args) 
	{
		
		new Super_calling_statement3(8);

	}

}
