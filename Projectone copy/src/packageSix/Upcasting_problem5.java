package packageSix;
class A1
{
	void add()
	{
		System.out.println("samlee3");
	}
}
class A2 extends A1
{
	void sub()
	{
		System.out.println("samlee2");
	}
}
class A3 extends A2
{
	void mul()
	{
		System.out.println("samlee1");
	}
}
public class Upcasting_problem5 extends A3
{
	class A4
	{
		void div()
		{
			System.out.println("samlee4");
		}
	}
	public static void main(String[] args) 
	{
	A2 a	=new A2();
	a.add();
	a.sub();

	}

}
