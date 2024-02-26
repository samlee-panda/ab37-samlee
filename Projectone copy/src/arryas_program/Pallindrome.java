package arryas_program;

public class Pallindrome {

	public static void main(String[] args) 
	{
		String name="mom";
		String name2="";
		for(int i=2;i>=0;i--)
		{
		char reverse=	name.charAt(i);
		name2=name2+reverse;
		}
		System.out.println(name2);
		if(name2.equals(name))
		{
			System.out.println("it is pallindrome");
		}
		else
		{
			System.out.println("it is not a pallindrome");
		}
	}

}
