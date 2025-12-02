package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1_BeforeAfter {
@BeforeSuite
 public void BS()
 {
	System.out.println("Before suit");
 }
@BeforeTest
public void BT()
{
	System.out.println("before test");
}
@BeforeClass
public void BC()
{
	System.out.println("before class");
}
@BeforeMethod
public void BM()
{
	System.out.println("Before Method");	
}
@Test
public void test1()
{
	System.out.println("test1");
}
@Test
public void main()
{
	System.out.println("test2");
}
@AfterMethod
public void AM()
{
	System.out.println("after method");
}
@AfterClass
public void AC()
{
	System.out.println("after class");
}
@AfterTest
public void AT()
{
	System.out.println("After Test");
	
}
@AfterSuite
public void AS()
{
	System.out.println("After suit");
}
}
