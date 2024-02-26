package packageOne;
  interface State3
{
	void state_ittax();
	void state_gsttax();
}
   interface Country3
{
	void country_ittax();
	void country_gsttax();
}
	interface Dist
	{
		void Dist_ittax();
		void Dist_gsttax();
	}
	interface Town
	{
		void Town_ittax();
		void Town_gsttax();
	}
public class Interfaceprogram4 implements State3,Country3,Dist,Town
{

	public static void main(String[] args) 
	{
		Interfaceprogram4  i1= new Interfaceprogram4();
		i1.country_gsttax();
		i1.country_ittax();
		i1.Dist_gsttax();
		i1.Dist_ittax();
		i1.state_gsttax();
		i1.state_ittax();
		i1.Town_gsttax();
		i1.Town_ittax();
	}
	public void Town_ittax() 
	{	
		System.out.println("a");
	}	
	public void Town_gsttax() 
	{
		System.out.println("b");
	}	
	public void Dist_ittax() 
	{
		System.out.println("c");		
	}	
	public void Dist_gsttax() 
	{
		System.out.println("d");		
	}	
	public void country_ittax() 
	{		
		System.out.println("e");
	}	
	public void country_gsttax() 
	{		
		System.out.println("f");
	}
	public void state_ittax() 
	{
		System.out.println("g");		
	}
	public void state_gsttax()
	{
		System.out.println("h");
		
	}

}
