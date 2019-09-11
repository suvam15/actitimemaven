package test;

import org.testng.annotations.Test;
import genirics.BaseTest;
import pom.POMActitimeCustomerPage;
import pom.PomActiTimeLogin;

public class TESTActitimeCustomer extends BaseTest
{
	@Test
	public void customer() throws InterruptedException
	{
		PomActiTimeLogin login=new pom.PomActiTimeLogin(driver);
		login.LoginMethod();
		
		pom.POMActitimeCustomerPage customer=new POMActitimeCustomerPage(driver);
		customer.customerMethod();	
	}	

}
