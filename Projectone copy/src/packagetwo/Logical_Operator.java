package packagetwo;

public class Logical_Operator {

	public static void main(String[] args) {
		int a=10, b=5;
		if(a>b && b==5)
			//And operator
		{
			System.out.println("and");
		}
		if(a>b || b>a)
			//or operator
		{
			System.out.println("or");
		}
		if(!(a>b && b==5))
			//and not operator
		{
			System.out.println("not");
		}

	}

}
