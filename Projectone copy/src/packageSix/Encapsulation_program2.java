package packageSix;

class Authentication
{
	 private String username="samlee.panda";
	 private String password="saml@123";

public String Get_username()
{
	return username;// when we return the (ex:user name) whattever the data type of username should be same with the method return type
	//we are usring return keyword to get the value
}
public void Set_username(String username)
// to set the user name it must be parametrized method
{
	this.username=username;
}
public String Get_password()
{
	return password;
}
public void Set_password(String password)
{
	this.password=password;
}
}

public class Encapsulation_program2 {

	public static void main(String[] args) 
	{
		Authentication a1=new Authentication();
		a1.Set_username("Bipun@gmail.com");
		System.out.println(a1.Get_username());
		a1.Set_password("bipun@123");
		System.out.println(a1.Get_password());

	}

}
