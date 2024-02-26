package arryas_program;

public class Program3_string_int_double {

	public static void main(String[] args) 
	{
		String name[]= new String[3];
		int rollno[]=new int[3];
		double salary[]=new double[3];
		name[0]="Samlee";
		rollno[0]=5;
		salary[0]=8362.78;
		
		name[1]="Bipun";
		rollno[1]=12;
		salary[1]=5678.78;
		
		name[2]="Adya";
		rollno[2]=34;
		salary[2]=7895.78;
		
		for(int i=0;i<3;i++)
		{
			System.out.println(name[i]);
			System.out.println(rollno[i]);
			System.out.println(salary[i]);
		}
		
	}

}
