package com.OrangeHRMApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest
{
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@BeforeTest
	public void orangeHRMApplicationLauch()
	{

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	// implicitlyWait - is a smart wait and also an intelligent wait
	// its a global Wait
	// This wait is application for every Navigated WebPage- it will automatically get applicable
//	    for all the Navigated WebPage of all the WebElement in the Page under Test
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	// System.out.println(" ************ OrangeHRM Application Launched Successfully ************");

	Log.info(" ************ OrangeHRM Application Launched Successfully ************");

	}


	@AfterTest
	public void orangeHRMApplicationClose()
	{
	driver.close();

	// System.out.println(" **************** OrangeHRM Application Closed Successfully *********");
	Log.info(" **************** OrangeHRM Application Closed Successfully *********");
	}

}
