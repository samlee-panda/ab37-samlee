package packagethree;// we are writing this just for understanding

class Teacher
{
	static void selenium()
	{
		System.out.println("selenium");
	}
	static void java()
	{
		System.out.println("java");
	}
}

public class Inheritance extends Teacher
{
	
		static void gk()
		{
			System.out.println("General knowledge");
		}

		public static void main(String[] args) 
		{
		gk();
		selenium();
		java();
		}
	}

