package packagetwo;

public class Sib_Iib {
	Sib_Iib()
	{
		System.out.println("I am constructor");
	}
	Sib_Iib(int a)
	{
		System.out.println("I am constructor 2");
	}
	static
	{
		System.out.println("I am sib");
	}
	{
		System.out.println("I am IIB");
	}
	{
		System.out.println("I am IIB 2");
	}
	public static void main(String[] args) 
	{
		new Sib_Iib();
System.out.println("I am main method");

new Sib_Iib();

	}

	static
	{
		System.out.println("I am sib 2");
	}
}
