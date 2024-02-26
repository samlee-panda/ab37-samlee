package packageOne;

public class Nonstatic_globalvariable_assignment 
{
	int a;
	int b;
	int sum;
	int sub;
	 void substract()
	{
		a=15;
		b=10;
		 sub=a-b;
	System.out.println(sub);
	}
 void add()
	{
		a=7;
		b=2;
		sum=a+b;
	System.out.println(sum);
	
			
	}

	public static void main(String[] args) 
	{
		Nonstatic_globalvariable_assignment n1= new Nonstatic_globalvariable_assignment();
		n1.substract();
		n1.add();

	}

}
