package packagethree;

public class Studentclass2 extends Teacherclass2
{
    void gk()
	{
		System.out.println("General knowledge");
	}
    void gk(int a)
	{
		System.out.println("General knowledge 2");
	}
    

    

	public static void main(String[] args) 
	{
		Studentclass2 s1= new Studentclass2();
		s1.gk();
		s1.gk(5);
		s1.selenium();
		s1.java();
		System.out.println("hi");

	}

}
