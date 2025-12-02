package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
@Test
public void title()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String Actual_Title=driver.getTitle();
	System.out.println("Actual Title is"+Actual_Title);
	String Expected_Title="Google";
	System.out.println("Expected Title is"+ Expected_Title);
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(Actual_Title, Expected_Title);
	System.out.println("Title is same");
	System.out.println("Test Executed");

	soft.assertAll();
}
@Test
public void test1()
{
	System.out.println("Test case1");
}

}
