package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCustomerPage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//div[.='TASKS']")
	private WebElement taskLink;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerLink;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerNameTextfield;
	
	@FindBy(xpath="//div[@class='components_button  withPlusIcon']")
	private WebElement createCustomerButton;
	
	/*@FindBy(xpath="(//div[@class='dropdownButton'])[1]")
	private WebElement dropdownButton;*/
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelCustomer;
	
	public POMActitimeCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void customerMethod() throws InterruptedException
	{
		Thread.sleep(10000);
		taskLink.click();
		addNewButton.click();
		newCustomerLink.click();
		enterCustomerNameTextfield.sendKeys("suvam");
		//dropdownButton.click();
		//createCustomerButton.click();
		 
	}
	
	public void cancel()
	{
		cancelCustomer.click();
		Alert alt=driver.switchTo().alert();
		//alt.dismiss();
		alt.accept();
	}

}
