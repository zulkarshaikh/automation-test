package com.maven.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	//PageFactory - OR
	@FindBy(name="FirstName")
	WebElement firstName;
	
	@FindBy(name="LastName")
	WebElement lastName;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement loginButton;
	
	public LoginPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public NextPage login(String fn, String ln)
	{
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		
		loginButton.click();
		return new NextPage();
	}
}
