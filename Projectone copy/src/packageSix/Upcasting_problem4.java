package packageSix;
class three
{
	void add()
	{
		System.out.println("samlee3");
	}
}
class two extends three
{
	void sub()
	{
		System.out.println("samlee2");
	}
}
class One extends two
{
	void mul()
	{
		System.out.println("samlee1");
	}
}
public class Upcasting_problem4 extends One
{
	void div()
	{
		System.out.println("samlee4");
	}

	public static void main(String[] args) 
	{
	two t1	=new One();
	t1.add();
	t1.sub();
	}

}
