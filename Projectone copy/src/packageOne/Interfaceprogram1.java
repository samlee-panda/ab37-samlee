package packageOne;

interface loginpage
{
	void signin();
	void signout();	
}
interface landingpage extends loginpage
{
	void click();
	void submit();
}

public class Interfaceprogram1 implements landingpage
{
	public static void main(String[] args) 
	{
		Interfaceprogram1 i1 =new Interfaceprogram1();
		i1.signin();
		i1.signout();
		i1.submit();
		i1.click();
	}
	public void signin() 
	{
		System.out.println("signin");
		
	}
	public void signout() 
	{
		System.out.println("signout");
	}
	public void click() 
	{
		System.out.println("click");
	}
	public void submit() 
	{
		System.out.println("submit");
	}

}
