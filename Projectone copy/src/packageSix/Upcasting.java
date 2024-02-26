package packageSix;
class excelsheet
{
	void add()
	{
		System.out.println("addition");
	}
}
public class Upcasting extends excelsheet
{
void sub()
{
	System.out.println("substraction");
}
	public static void main(String[] args) 
	{
		excelsheet e1=	new Upcasting();//upcasting
		//in case of upcasting we can only access the parent class property and no longer able to use child class 
		e1.add();

	}

}
