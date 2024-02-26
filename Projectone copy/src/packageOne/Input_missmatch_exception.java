package packageOne;

import java.util.Scanner;

public class Input_missmatch_exception {
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		byte a=s1.nextByte();
		short b= s1.nextShort();
		int c= s1.nextInt();
		long d= s1.nextLong();
		float e= s1.nextFloat();
		double f=s1.nextDouble();
		boolean g=s1.hasNext();
		String h= s1.next();
		
	}

}
