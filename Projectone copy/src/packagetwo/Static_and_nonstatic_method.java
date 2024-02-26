package packagetwo;

public class Static_and_nonstatic_method {

	static void add()
	{
		int a=2,b=3;
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a=9, b=1;
		int sub=a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args) 
	{
	add();
	sub();
	Static_and_nonstatic_method s= new Static_and_nonstatic_method();
	s.multiplication();
	s.division();
	}
	
	void multiplication()
	{
		int a=5, b=4;
		int multiplication=a*b;
		System.out.println(multiplication);
	}
	void division()
	{
		int a=9,b=2;
		int division=a/b;
		System.out.println(division);
	}

}
