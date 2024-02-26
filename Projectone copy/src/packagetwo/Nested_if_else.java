package packagetwo;

public class Nested_if_else {

	public static void main(String[] args) {
		int a=10,b=5;
		if(a>b)
		{
			if(a==10)
			{
				if (b>a)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("2");
				}
			}
			else
			{
				System.out.println("3");
			}
		}
		else
		{
			System.out.println("4");
		}
}

}