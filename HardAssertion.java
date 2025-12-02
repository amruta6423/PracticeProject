package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssertion {

@Test
public void assertion()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	String Actual_Title=driver.getTitle();
    System.out.println(Actual_Title);
	String Expected_Title="Google";
	Assert.assertEquals(Expected_Title,Actual_Title);
	System.out.println(" title  is correct");
	
}
@Test
public void test1()
{
	System.out.println("Test case1");
}
}
