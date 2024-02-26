package packagetwo;

public class Method_overloading {
	
	static void add(int a)
	{
		int sum=a+6;
		System.out.println(sum);
	}

	static void add(double a)
	{
		System.out.println("b");
	}
	void add(char a)
	{
		System.out.println("c");
	}
	void add(boolean a)
	{
		System.out.println("d");
	}
	void add(String a)
	{
		System.out.println("e");
	}
	public static void main(String[] args) {
		add(4);
		add(4.54);
		Method_overloading m= new Method_overloading();
		m.add('a');
		m.add(false);
		m.add("samlee");

	}

}
