package TestNG;

import org.testng.annotations.Test;

public class Day2_Priority {
@Test(priority=0)
public void Test1()
{
	System.out.println("First Priority");
}
@Test(priority=2)
public void Test2()
{
	System.out.println("second priority");
}
@Test(priority=-1)
public void Test3()
{
	System.out.println("less priority");
}
@Test
public void Test4()
{
	System.out.println("default priority");
}
}
