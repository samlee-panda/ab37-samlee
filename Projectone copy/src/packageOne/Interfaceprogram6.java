package packageOne;
interface logic3
{
	void mul();
}
interface logic2 extends logic3
{
	void sub();
}
abstract class logic1 implements logic2
{
	static void add()
	{
		System.out.println("addition");
	}
}
public class Interfaceprogram6 extends logic1
{

	public static void main(String[] args) 
	{
		Interfaceprogram6 i1= new Interfaceprogram6();
		i1.mul();
		i1.sub();
		add();
	}

	public void sub()
	{
		System.out.println("substraction");
	}

	public void mul() 
	{
		System.out.println("multiplication");
		
	}

}
