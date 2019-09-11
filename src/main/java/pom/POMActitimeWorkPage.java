package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMActitimeWorkPage
{
public WebDriver driver;
	
	@FindBy(id="Layer_1")
	private WebElement settingsLink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesOfWorkLink;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createTypeOfWorkButton;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement nameTextfield;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement statusDropDownList;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createWorkButton;
	
	//deleteWork
	@FindBy(xpath="//a[.='supreethi']/../..//a[contains(text(),'delete')]")
	private WebElement deleteLink;
	
	public POMActitimeWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void workMethod() throws InterruptedException
	{
		Thread.sleep(10000);
		settingsLink.click();
		typesOfWorkLink.click();
		createTypeOfWorkButton.click();
		nameTextfield.sendKeys("archu");
		Select sel=new Select(statusDropDownList);
		sel.selectByIndex(1);
		createWorkButton.click();
	}
	
	public void delete()
	{
		deleteLink.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
