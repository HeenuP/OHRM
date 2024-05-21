package com.OrangeHRMApplicationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class BaseTest 
{
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


	public void orangeHRMApplicationLauch()
	{

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	}

  @AfterTest
	public void orangeHRMApplicationClose()
	{
	driver.close();
    }
	
}
