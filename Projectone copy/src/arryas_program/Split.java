package arryas_program;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) 
	{
		String s="my name is samlee";
		String s2[]=  s.split(" ");//here we are converting string to array
		System.out.println(Arrays.toString(s2));
		System.out.println(s2[1]);
		
	}

}
