package packagetwo;

public class Constructor_overloading
{
	Constructor_overloading(int a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
		
	}
	Constructor_overloading(byte a, short b)
	{
		int add=a*b;
		System.out.println(add);
	}
	
	
	public static void main(String[] args) 
	{
		new Constructor_overloading(3,4.5);
		new Constructor_overloading(2,5);
	}
		

	

}
