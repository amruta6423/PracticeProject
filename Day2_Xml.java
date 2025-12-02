package TestNG;

import org.testng.annotations.Test;

public class Day2_Xml {
	@Test(groups="Regression")
	public void AA()
	{
		System.out.println("regression test1");
	}
@Test(groups="Retest")
public void BB()
{
	System.out.println("Retest 1");
}
@Test(groups="Regression")
public void CC()
{
	System.out.println("Regression 2");
}
@Test(groups="Retest")
public void DD()
{
	System.out.println("Retest 2");
}
}
