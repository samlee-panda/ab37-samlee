package packageSix;
class Signin
{
	private double a=345678.9999;

	public double getA() {
		return a;
	}

	public void setA(double a) 
	{
		this.a = a;
	}
}

public class Encapsulation_assignmnet3 {

	public static void main(String[] args) 
	{
		Signin s1= new Signin();
		s1.setA(6.756);
		System.out.println(s1.getA());

	}

}
