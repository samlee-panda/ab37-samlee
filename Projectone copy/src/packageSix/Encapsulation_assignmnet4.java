package packageSix;
class student
{
	private boolean pass=true;

	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}
}

public class Encapsulation_assignmnet4 {

	public static void main(String[] args) 
	{
		student s1= new student();
		s1.setPass(false);
		System.out.println(s1.isPass());

	}

}
