package packageSix;
class Amazon_login
{
	private String username="samleepanda@gmail.com";

	public String getUsername() //this is getter method
	{
		return username;//fetched the value
	}

	public void setUsername(String username) //this is setter method
	{
		this.username = username;
	}
}
public class Encapsulation {

	public static void main(String[] args) 
	{
		Amazon_login a1= new Amazon_login();
		a1.setUsername("abc@gmail.com");
		System.out.println(a1.getUsername());

	}

}
