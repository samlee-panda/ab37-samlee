package packageOne;

class one
{
	 void add()
	{
		System.out.println("samlee");
	}
	
}

public class Method_overriding2 extends one
{
	 void add()
	{
		super.add();
		System.out.println("samlee 2");
	}
	


	
	public static void main(String[] args) 
	{
		Method_overriding2 o1=new  Method_overriding2 ();
		o1.add();

	}

}
