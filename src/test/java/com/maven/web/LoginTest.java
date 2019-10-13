package com.maven.web;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{

	LoginPage loginPage;
	NextPage nextPage;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		loginPage = new LoginPage();
	}

	@Test(priority=1)
	public void loginTest()
	{
		nextPage = loginPage.login("zulfi", "zulfi");
	}
	
	@AfterMethod
	public void destroy()
	{
		driver.quit();
	}
}
