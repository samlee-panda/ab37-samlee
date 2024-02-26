package packageseven;

import java.util.LinkedList;
import java.util.Vector;

public class Vector_void_program {

	public static void main(String[] args) {
		Vector v1=new Vector();
		LinkedList l1= new LinkedList();
		v1.add("samlee");
		v1.add("bipun");
		v1.add("samlee");
		v1.add('s');
		v1.add(null);
		v1.add("samlee");
		v1.add(5);
		v1.add(null);
		v1.add(null);
		//Collections.sort(l1);
		System.out.println(v1);

	}

}
