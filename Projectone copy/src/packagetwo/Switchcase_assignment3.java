package packagetwo;

import java.util.Scanner;

public class Switchcase_assignment3 {
	Scanner s1= new Scanner(System.in);
	int a= s1.nextInt();
	int b= s1.nextInt();
	int sum=a+b;
	int sub=a-b;
	int div=a/b;
	int mul=a*b;
	
	public static void main(String[] args) {
		Switchcase_assignment3 a= new Switchcase_assignment3();
		
		
		switch(1)
		{
		case 1:System.out.println(a.sum);
		case 2:System.out.println(a.sub);
		case 3:System.out.println(a.div);
		case 4:System.out.println(a.mul);
		break;
		}
		
		


	}

}
