package packagefive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch2 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		try
		{
			int c=1/0;
		}
		catch(ArithmeticException b1)
		{
			System.out.println("I have handled the Arithmatic exception");
		}
		try
		{
		int a= s1.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("I have handled the inputmissmatch exception");
		}
		

	}

}
