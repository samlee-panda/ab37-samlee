package packageseven;

import java.util.Scanner;

public class Return_assignment2 
{
	Scanner s1= new Scanner(System.in);
	int add()
	{
		int a=s1.nextInt();
		int b= s1.nextInt();
	    int sum= a+b;
		return sum;
	}
	float add2()
	{
		float a= s1.nextFloat();
		float b= s1.nextFloat();
		float sub=a-b;
		return sub;
	}
	String add3()
	{
		String a= s1.next();
		return a;
	}
	boolean add4()
	{
		boolean a= s1.nextBoolean();
		return a;
	}

	public static void main(String[] args) 
	{
		Return_assignment2  r1= new Return_assignment2 ();
	System.out.println(r1.add());
	System.out.println(r1.add2());
	System.out.println(r1.add3());
	System.out.println(r1.add4());
		

	}

}
