package packageOne;
class state_class
{
	state_class(int a)
	{
		System.out.println("9");
	}
}
public class Super_calling_statement extends state_class
{
	Super_calling_statement()
	{
		super(5);
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		new Super_calling_statement();
	}

}
