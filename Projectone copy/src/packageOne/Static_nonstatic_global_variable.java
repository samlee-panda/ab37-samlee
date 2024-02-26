package packageOne;

public class Static_nonstatic_global_variable 
{
	static String name="samlee";
	double pi=3.14;
	public static void main(String[] args) 
	{
		
		System.out.println(name);//this is how we can call static global variable
		Static_nonstatic_global_variable s=new Static_nonstatic_global_variable();
		System.out.println(s.pi);//this is how we can call non static global variable
		
	}

}
