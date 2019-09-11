package test;

import org.testng.annotations.Test;

import genirics.BaseTest;
import pom.POMActitimeWorkPage;
import pom.PomActiTimeLogin;


public class TESTActitimeWork extends BaseTest
{
	@Test
	public void work() throws InterruptedException 
	{
		PomActiTimeLogin login=new PomActiTimeLogin(driver);
		login.LoginMethod();
		
		POMActitimeWorkPage work=new POMActitimeWorkPage(driver);
		work.workMethod();
	}

}
