package packageseven;

public class Assert2 {

	public static void main(String[] args) {
		int no1=100;
		int no2=200;
		//assert no1>no2;//Syntax
		assert no1>no2: "condition didn't match"; //2nd syntax
		System.out.println(no1+no2);
		

	}

}
