package packageOne;
interface entrance
{
	void gate();
}
interface exit 
{
	void out();
}
abstract class enter implements exit,entrance
{
	abstract void in();
}
public class Interfaceprogram5 extends enter
{

	public static void main(String[] args) 
	{
		
		Interfaceprogram5 i1= new Interfaceprogram5();
		i1.in();
		i1.out();
		i1.gate();
	}

	void in() 
	{
		System.out.println("in");
		
	}
	public void out() 
	{
		System.out.println("out");
		
	}
	public void gate() 
	{
		System.out.println("gate");
		
	}

}
