package packageseven;

public class Return_demo {
int add(int a,int b)
{
	int sum=a+b;
	return sum;
}
double substract(int a,double b)
{
	double sub=a-b;
	return sub;
}

	public static void main(String[] args)
	{
		Return_demo r1= new Return_demo ();
		r1.add(10, 5);
		r1.substract(10, 5.0);

	}

}
