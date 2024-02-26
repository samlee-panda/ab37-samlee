package arryas_program;
//Take any alphanumeric string and check at which position there is numeric value
//samlee 123
public class Stringfunction_assignment7 {

	public static void main(String[] args) 
	{
		String name="samlee 123";
	char c1[]=	name.toCharArray();
	for(int i=0;i<name.length();i++)
	{
	boolean answer=	Character.isDigit(c1[i]);
		if(answer==true)
		{
			System.out.println(i);
		}
	
	}

	}

}
