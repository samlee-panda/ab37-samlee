package arryas_program;

import java.util.Arrays;

public class Howtosortarray {

	public static void main(String[] args) 
	{
		String name[]= new String[3];
		name[0]="ram";
		name[1]="ankita";
		name[2]="zuhi";
		System.out.println(Arrays.toString(name));
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));

	}

}
