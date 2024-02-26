package packageOne;

interface three
{
	void hi();
}
interface two extends three
{
	void hello();
}
interface one1 extends two
{
	void hey();
}
public class Interfaceprogram7 implements one1
{

	public static void main(String[] args) 
	{
		Interfaceprogram7 i1= new Interfaceprogram7();
		i1.hello();
		i1.hi();
		i1.hey();
		i1.hey();

	}

	public void hello() 
	{
		System.out.println("1");
		
	}
	public void hi() 
	{
		System.out.println("2");
		
	}
	public void hey() 
	{
		System.out.println("3");
		
	}

}
