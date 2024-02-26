package arryas_program;

public class Array_assignmet {

	public static void main(String[] args) {
		/* int number[]=new int[4];// 1st syntax
		number[0]=45;
				number[1]=21;
				number[2]=11;
				number[3]=35; */
				
		//2nd Syntax of array		

		int listofnumber[]= {25,21,11,35};
		int rollnotocheck=11;
		for(int i=0;i<=3;i++)
		{
			if(rollnotocheck==listofnumber[i])
			{
				System.out.println("number is  present at index " +i );
			}
			
		}
		
	}

}
