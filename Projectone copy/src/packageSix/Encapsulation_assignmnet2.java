package packageSix;
class password
{
	private float password=2.5f;
	public float get_password()
	{
		return password;
	}
	public void set_password(float password)
	{
		this.password=password;
	}
}
public class Encapsulation_assignmnet2 {

	public static void main(String[] args) 
	{
		password p1= new password();
		p1.set_password(345.5f);
		System.out.println(p1.get_password());
				

	}

}
