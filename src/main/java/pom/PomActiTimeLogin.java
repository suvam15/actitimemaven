package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomActiTimeLogin 
{
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement KeepLoggedMe;
	
	@FindBy(xpath="//a[.='Login ']")
	private WebElement LoginBotton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement ForgetPassword;
	

	public PomActiTimeLogin(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginMethod()
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		KeepLoggedMe.click();
		LoginBotton.click();
		
	}
	
	public void ForgetPassword()
	{
		ForgetPassword.click();
	}

}
