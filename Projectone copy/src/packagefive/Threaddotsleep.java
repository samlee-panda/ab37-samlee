package packagefive;

public class Threaddotsleep {

	public static void main(String[] args) throws InterruptedException 
	{
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
		Thread.sleep(500);
	}
	throw new NullPointerException();

	}

}
