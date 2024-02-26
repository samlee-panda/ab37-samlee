package packagetwo;

public class If_Else_if 
{
public static void main(String[] args) 
{
	int a,b;
	a=20;
	b=30;
	if(b>a)
	{
		System.out.println("print 1st condition");
	}
	else if(b==30)
	{
		System.out.println("print 2nd condition");
		//note: if one condition is true then it will only get execute, if other condition also true it doesn't get execute 
	}
	else if(a==10)
	{
		System.out.println("print 3rd condition");
	}
	else
	{
		System.out.println("print else condition");
	}
}
	
}
