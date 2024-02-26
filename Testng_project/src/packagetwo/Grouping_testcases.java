package packagetwo;

import org.testng.annotations.Test;

public class Grouping_testcases 
{
@Test(groups= {"smoke","system"})
public void add()
{
	System.out.println("addition");
}
@Test(groups=("system"))
public void sub()
{
	System.out.println("sub");
}
@Test(groups=("smoke"))
public void mul()
{
	System.out.println("mul");
}
@Test
public void div()
{
	System.out.println("div");
}
}
