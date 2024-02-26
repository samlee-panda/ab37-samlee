package arryas_program;

import java.util.Arrays;

public class Copyvaluetoanotherarrayusingiteration {

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		        rollno[0]=45;
				rollno[1]=67;
				rollno[2]=32;
				rollno[3]=11;
				int rn1[]=new int[4];
				for(int i=0;i<4;i++) 
				{
					rn1[i]=rollno[i]; 
				}
			
		      System.out.println("copied array is:" +Arrays.toString(rn1)); 
		    

	}

}
