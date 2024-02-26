package arryas_program;

public class Reverse_string {

	public static void main(String[] args) 
	{
		String input="samlee";
		String output="";
		for(int i=input.length()-1;i>=0;i--) 
		{
		char reverse= input.charAt(i);//this will print the string as char
		output=output+reverse;
		
		}
		System.out.println(output);
	}

}
