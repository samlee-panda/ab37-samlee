package packagefive;

public class Throw_assignment {

	public static void main(String[] args)  
	{
		int age=25;
		if(age>18)
		{
			System.out.println("Allow him to visit the website called google.com");
		}
		else
		{
			throw new ArithmeticException();
		}

	}

}
