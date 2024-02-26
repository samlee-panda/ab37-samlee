package packageSix;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add(10);
	a1.add(8);
	a1.add(34);
	a1.add(97);
	
	Collections.sort(a1);
	System.out.println(a1);
	a1.add(45);
	a1.add(45);
	a1.add(null);
	a1.add(45);
	a1.add('a');
	System.out.println(a1);
	
	

	}

}
