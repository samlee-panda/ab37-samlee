package packageOne;

public class Local_variable {

	void add() {
		int a = 105;
		System.out.println(a);

	}

	static void add(int a) {
		a = 100;
		System.out.println(a);
	}

	public static void main(String[] args) {
		add(5);
		int a;
		a = 10;
		System.out.println(a);
		Local_variable a1 = new Local_variable();
		a1.add();
	}
	

}
