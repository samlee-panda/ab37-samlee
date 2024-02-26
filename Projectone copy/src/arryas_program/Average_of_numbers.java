package arryas_program;

public class Average_of_numbers {

	public static void main(String[] args) 
	{
		int num[]= new int[4];
		        num[0]=7;
				num[1]=6;
				num[2]=5;
				num[3]=3;
				int sum=0;
				//double average=(num[0]+num[1]+num[2]+num[3]/4);//
				//double average=(num[0]+num[1]+num[2]+num[3]/num.length);
				//System.out.println(average);
				for(int i=0;i<num.length;i++) 
				{
					sum=sum+num[i];
				}
				System.out.println(sum);
				double average=sum/num.length;
				System.out.println(average);
	}

}
