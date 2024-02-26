package packageOne;
class One23
{
	One23()
	{
		System.out.println("1");
	}
}
class two24 extends One23
{
	two24()
	{
		super();
		System.out.println("2");
	}
}
public class Super_calling_statement2 extends two24
{
	Super_calling_statement2()
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		new Super_calling_statement2();

	}

}
