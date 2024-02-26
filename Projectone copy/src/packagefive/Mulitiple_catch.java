package packagefive;

import java.util.InputMismatchException;

public class Mulitiple_catch 
{
public static void main(String[] args) 
{
	try
	{
		int c=1/0;
		System.out.println(c);
	}
	catch(ArithmeticException a1)
	{
		System.out.println("int can not store infinity");
	}
	catch(NullPointerException a2)
	{
		System.out.println("do not worry I have handled it");
	}
	catch(InputMismatchException a3)
	{
		System.out.println(" I have handled it");
	}
}
}
