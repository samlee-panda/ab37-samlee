package packageSix;
class Upcasting2
{
	void add()
	{
		System.out.println("samlee2");
	}

}
class Upcasting1 extends Upcasting2
{
	void mul()
	{
		System.out.println("samlee1");
	}

}
public class Upcasting_problem2 extends Upcasting1
{
	void div()
	{
		System.out.println("samlee2");
	}


	public static void main(String[] args) 
	{
		Upcasting2 u1	=new Upcasting_problem2(); //upcasting child class to grand parent class
		u1.add();
		Upcasting_problem2 a=(Upcasting_problem2) u1;//downcasting
		a.add();

	}

}
