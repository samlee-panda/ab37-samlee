package packageFour;

class Inheritance_four
{
	void div()
	{
		System.out.println("div using scanner class");
	}

}

 class Inheritace_three extends Inheritance_four
{ 
	  void add()
		{
			System.out.println("addition using scanner class");
		}

}
 
 class Inheritace_two extends Inheritace_three
 {
	  void substraction()
		{
			System.out.println("substarction using scanner class");
		}
	 
 }

public class Inheritance_one extends Inheritace_two
{
	 void multiplication()
	{
		System.out.println("multiplication using scanner class");
	}
public static void main(String[] args)
{
	Inheritance_one i1= new Inheritance_one();
	i1.multiplication();
	i1.substraction();
	i1.add();
	i1.div();
	i1.add();
	
}
}
