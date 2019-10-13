package com.maven.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver ;

public BaseClass()
{
	this.initialize();
}

public static void initialize()
{
	System.setProperty("webdriver.chrome.driver", "E://Zulkarnain/chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MINUTES);
	
	driver.get("http://localhost:9080/maven-web-poc/");
}
}
