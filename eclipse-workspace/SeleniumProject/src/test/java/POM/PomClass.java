package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PomClass {
	WebDriver driver;
	@BeforeMethod
	public void Set()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
	}
	@Test
	public void Login() throws InterruptedException
	{
		PomElement pom=PageFactory.initElements(driver,PomElement.class);
		pom.getText_Emailid().sendKeys("abc@gmail.com");
		pom.getText_Password().sendKeys("abc@55");
		pom.getText_Login().click();
		//Thread.sleep(2000);
	}
}
