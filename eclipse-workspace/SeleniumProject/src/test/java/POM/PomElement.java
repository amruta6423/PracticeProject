package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PomElement {
	@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement Text_Emailid;
	@FindBy(how=How.XPATH,using="//input[@name='pass']")private WebElement Text_Password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement Text_Login;
	
	
	//get
	public WebElement getText_Emailid()
	{
		return Text_Emailid;
	}
	public WebElement getText_Password()
	{
		return Text_Password;
	}
	public WebElement getText_Login()
	{
		return Text_Login;
	}
}
