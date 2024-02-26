package packageseven;

import packageSix.Access3;

class Access
{
	void add()
	{
	System.out.println("samlee default");
	}
}

public class Access_specifier_for_class {

	public static void main(String[] args)
	{
		System.out.println("samlee public" );
		Access a1= new Access();
		a1.add();
	Access3 a2= new Access3();
	
		a2.name();
	}

}
