package packageFour;
interface samlee
{
	void bipun();
	
}
abstract class add15 implements samlee
{
	abstract void mul();
	void div3()
	{
		System.out.println("1");
	}
}

public class Test_program extends add15
{
	public static void main(String[] args) 
	{
		Test_program t1= new Test_program();
		t1.mul();
		t1.div();
		t1.div3();
		t1.bipun();
	}


	void mul() 
	{
		System.out.println("hi");
	}

	
	void div() {
		
		System.out.println("hiiii");
	}


	@Override
	public void bipun() {
		
		System.out.println("bhhiiii");
	}
}