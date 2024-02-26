package packageOne;

abstract class razorpayapi
{
	abstract void login();
	abstract void logout();
}

public class Abstract_class extends razorpayapi
{
	

	public static void main(String[] args) 
	{
		Abstract_class a1= new Abstract_class();
		a1.login();
		a1.logout();

	}

	 void login() 
	{
		System.out.println("login page");
		
	}

	void logout() 
	{
		System.out.println("logout page");
	}

}
