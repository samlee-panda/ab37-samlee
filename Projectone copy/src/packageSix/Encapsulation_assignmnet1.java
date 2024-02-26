package packageSix;
class Student_details
{
	private int rollno=34;

public int get_roolno()
{
	return rollno;
}
public void set_roolno(int rollno)
{
	this.rollno=rollno;
}
}
public class Encapsulation_assignmnet1 {

	public static void main(String[] args) 
	{
		Student_details s1= new Student_details();
		s1.set_roolno(54);
		System.out.println(s1.get_roolno());

	}

}
