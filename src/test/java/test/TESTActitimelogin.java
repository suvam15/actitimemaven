package test;

import org.testng.annotations.Test;

import genirics.BaseTest;
import pom.PomActiTimeLogin;

public class TESTActitimelogin extends BaseTest
{

	@Test
	public void login()
	{
		PomActiTimeLogin login=new PomActiTimeLogin(driver);
		login.LoginMethod();
	}

}
