package packageseven;

public class Return_assignment1 {
	boolean add(boolean a)
	{
		boolean state=true;
		return state;
	}
	String add(String a)
	{
		String name="samlee";
		return name;
	}
	float sub(float a, float b)
	{
		float substraction= a-b;
		return substraction;
	}

	public static void main(String[] args) 
	{
		Return_assignment1 r1= new Return_assignment1();
		System.out.println(r1.add(false));
		System.out.println(r1.add("bipun"));
		System.out.println(r1.sub(5.5f, 3.4f));

	}

}
