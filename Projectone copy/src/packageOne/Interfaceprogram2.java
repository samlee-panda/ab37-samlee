package packageOne;

interface Country
{
	void countrycollection();
}
abstract class State implements Country
{
	abstract void state_roads();
	static void statecollection()
	{
		System.out.println("state collection for this month is :987");
	}
}

public class Interfaceprogram2 extends State
{

	public static void main(String[] args) 
	{
		Interfaceprogram2 i2= new Interfaceprogram2();
		i2.countrycollection();
		i2.state_roads();
		statecollection();
				

	}
	public void countrycollection() 
	{
		System.out.println("logic 1");
		
	}

	void state_roads() 
	{
		
		System.out.println("logic 2");
	}

}
