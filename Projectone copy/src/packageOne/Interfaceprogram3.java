package packageOne;//this program is the example of multiple inheritance
interface State2
{
	void state_ittax();
	void state_gsttax();
}
interface Country2
{
	void country_ittax();
	void country_gsttax();
}
public class Interfaceprogram3 implements Country2,State2
{
	public static void main(String[] args) 
	{
		Interfaceprogram3 i1= new Interfaceprogram3();
		i1.country_gsttax();
		i1.country_ittax();
		i1.state_gsttax();
		i1.state_ittax();
	}
	public void state_ittax()
	{
		System.out.println("ittax");		
	}	
	public void state_gsttax() 
	{
		System.out.println("gsttax");
	}	
	public void country_ittax() 
	{	
		System.out.println("ittax2");
	}
	public void country_gsttax() 
	{
		System.out.println("gsttax2");
		
	}

}
