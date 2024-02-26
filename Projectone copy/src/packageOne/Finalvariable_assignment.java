package packageOne;

public class Finalvariable_assignment 
{
	final static double pi=3.14;
	
	 
	static void areaofcircle()
	{
		int r=14;
		double a=pi*r*r;
		System.out.println(a);
	}
	public static void main(String[] args) {
		int r=7;
		double a=pi*r*r;
		System.out.println(a);
		
		areaofcircle();
	}

}
