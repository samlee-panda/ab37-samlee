package arryas_program;

import java.util.Date;

public class Current_time_of_a_system {

	public static void main(String[] args) 
	{
	Date d1=new Date();
	System.out.println(d1.getTime());
	Date d2= new Date(d1.getTime());// this is how you can print the human understadable time
	System.out.println(d2);
	
	

	}

}
