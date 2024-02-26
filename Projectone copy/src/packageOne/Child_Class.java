package packageOne;

interface Amazon
{
	void login();
	void logout();
}

public class Child_Class implements Amazon
{

	public static void main(String[] args)
	{
		Child_Class c1= new Child_Class();
		c1.login();
		c1.logout();

	}
	public void login() 
	{
		System.out.println("login");
		
	}
	public void logout() 
	{
		
		System.out.println("logout");
	}

}
