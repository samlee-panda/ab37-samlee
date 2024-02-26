package packageOne;

public class this_keyword {
	int a;//default value is 0
	String name;//default value is null
	void student_details(int a,String name)//we don't have default values for local variable
	{
		this.a=a;
		this.name=name;//(this is how we assigned the local variable value to global variable with the help of this keyword)
		//local variable value should be same  with global variable in order to use the this keyword
		System.out.println("student details is as follows");
	}

	public static void main(String[] args) 
	{
		this_keyword t1=new this_keyword();
		t1.student_details(5,"samlee");
		System.out.println(t1.a);
		System.out.println(t1.name);
		


	}

}
