package packageSix;
class Upcasting4
{
	void add()
	{
		System.out.println("samlee2");
	}

}
class Upcasting3 extends Upcasting4
{
	void mul()
	{
		System.out.println("samlee1");
	}
}
public class Upcasting_problem3 extends Upcasting3
{
	void div()
	{
		System.out.println("samlee2");
	}
	public static void main(String[] args) 
	{
		Upcasting3 u1	=new Upcasting_problem3();//upcasting
		u1.add();
		u1.mul();
	}

}
