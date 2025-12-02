package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
WebDriver driver;
@Parameters("BrowserName")
@BeforeMethod
public void set(String BrowserName)
{
	if(BrowserName.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	if(BrowserName.equalsIgnoreCase("Edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	driver.get("https://www.google.com/");
}

@Test
public void test1()
{
	System.out.println("execute");
	}
}
