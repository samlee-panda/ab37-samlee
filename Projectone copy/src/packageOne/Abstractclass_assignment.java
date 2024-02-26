package packageOne;

class addsub
{
	static void add()
	{
		System.out.println("addition");
	}
	void sub()
	{
		System.out.println("substarction");
	}
}
abstract class muldiv extends addsub
{
	abstract void mul();
	abstract void div();
}
public class Abstractclass_assignment extends muldiv
{	
	public static void main(String[] args) 
	{
		Abstractclass_assignment a1= new Abstractclass_assignment();
		add();
		a1.sub();
		a1.mul();
		a1.div();	
	}
	void mul()
	{
		System.out.println("multiplication");	
	}
	void div() 
	{
	System.out.println("division");
	}
}
