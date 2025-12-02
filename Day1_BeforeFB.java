package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1_BeforeFB {
WebDriver driver;
@BeforeMethod
public void main()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.manage().window().maximize();
}
@Test
public void test1() throws InterruptedException
{
	Thread.sleep(1000);
	WebElement username=driver.findElement(By.id("email"));
	username.sendKeys("test@gmail.com");
}
}
