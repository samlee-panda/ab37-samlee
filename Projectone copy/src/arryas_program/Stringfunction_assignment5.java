package arryas_program;
//take any alphanumeric value and check which is numeric value and which is charecter
public class Stringfunction_assignment5 {

	public static void main(String[] args) 
	{
		String name="samlee123";
	char c1[]=	name.toCharArray();
	for(int i=0; i<name.length();i++)
	{
		boolean b=  Character.isDigit(c1[i]);
		if(b==true)
		{
			System.out.println(c1[i]+ " is a digit");
		}
		else
		{
			System.out.println(c1[i]+ " is a number");
		}
	}
		

	}

}
