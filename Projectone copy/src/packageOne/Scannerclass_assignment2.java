package packageOne;

import java.util.Scanner;

public class Scannerclass_assignment2 {
	Scanner s1=new Scanner(System.in);
	int a= s1.nextInt();
	int b= s1.nextInt();
	int sum=a+b;
	int sub=a-b;
	int div=a/b;
	int mul=a*b;

	public static void main(String[] args) {
		Scannerclass_assignment2 s1= new Scannerclass_assignment2();
		System.out.println(s1.sum);
		System.out.println(s1.sub);
		System.out.println(s1.div);
		System.out.println(s1.mul);
		
		
		

	}

}
