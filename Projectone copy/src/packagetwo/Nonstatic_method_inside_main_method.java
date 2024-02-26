package packagetwo;

public class Nonstatic_method_inside_main_method {

	
	public static void main(String[] args) 
	{
		System.out.println("hello");
		Nonstatic_method_inside_main_method n= new Nonstatic_method_inside_main_method();
		n.add();
	
	}
	void add()
	{
		System.out.println("bye");
	}
}

