package packageOne;

 class samlee
{
     void name()
	{
		System.out.println("my name is samlee");
	}
	
}

public class Method_overriding extends samlee
{
	 void name()
	{
		System.out.println("my name");
		super.name();
		
	}

	public static void main(String[] args) 
	{
		Method_overriding m1= new Method_overriding();
		m1.name();
		
		

	}

}
