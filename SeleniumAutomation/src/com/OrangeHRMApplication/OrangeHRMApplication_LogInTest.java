package com.OrangeHRMApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Utility.Log;

public class OrangeHRMApplication_LogInTest extends BaseTest
{
	FileInputStream logInTestDataFile;
	XSSFWorkbook workBook;
	XSSFSheet logInTestDataSheet;
	Row logInTestDataRow;
	Cell logInUserNameRowOfCell;
	Cell logInPasswordRowOfCell;

	FileOutputStream testResultFile;

	FileInputStream orangeHRMApplicationPropertiesFile;

	Properties properties;

	WebElement welComeAdmin;

	@Test(priority=1,description=" Validating OrangeHRM Application LogInPage")
	public void orangeHRMApplicationValidation_LogInPage() throws IOException
	{
	// Expected Title should be - OrangeHRM


	String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";

	// System.out.println(" The expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);
	Log.info(" The expected Title of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageTitle);

	String actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();

	//System.out.println(" The actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageTitle);
	Log.info(" The actual Title of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageTitle);
	if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
	{
	// System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");

	Log.info(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
	}
	else
	{
	// System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
	Log.info("Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
	}

	System.out.println();
	// Expected Url Address shold have - orangehrm-4.2.0.1


	String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";

	//System.out.println(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);
	Log.info(" The Expected URL address of the OrangeHRM Application LogIN Page is :- "+expected_OrangeHRMApplicationLogInPageUrlAddress);

	String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();

	//System.out.println(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);
	Log.info(" The Actual URL address of the OrangeHRM Application LogIN Page is :- "+actual_OrangeHRMApplicationLogInPageUrlAddress);


	if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress))
	{

	//System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");
	Log.info(" Successfully Navigated to the OrangeHRM Application LogIN Page - PASS ");

	}
	else
	{
	// System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
	Log.info(" Failed to Navigate to the OrangeHRM Application LogIN Page - FAIL ");
	}

	System.out.println();

	// Expected LogIN Page TEXT - LOGIN Panel

	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";

	//System.out.println(" The Expected TEXT of the OrangeHRM Application LogIN page is :- "+expected_OrangeHRMApplicationLogInPageText);
	Log.info(" The Expected TEXT of the OrangeHRM Application LogIN page is :- "+expected_OrangeHRMApplicationLogInPageText);

	// Accessing the External Properties file
	orangeHRMApplicationPropertiesFile = new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");

	properties= new Properties(); // creating an object for Properties Class
	properties.load(orangeHRMApplicationPropertiesFile); // loading the Properties file

	// id="logInPanelHeading"
	// accessing the Property of the WebElement stored in the Properties file
	By orangeHRMApplicationLogInPageLogInPanelTextProperty=By.id
	                                        (properties.getProperty("logInPageLogInPanelProperty"));

	WebElement orangeHRMApplicationLogInPageLogInPanel=driver.findElement(orangeHRMApplicationLogInPageLogInPanelTextProperty);

	String actual_OrangeHRMApplicationLogInPageLogInPanelText=orangeHRMApplicationLogInPageLogInPanel.getText();

	System.out.println(" The Acutal Text of OrangeHRM Application LogIn Page TEXT is :- "+actual_OrangeHRMApplicationLogInPageLogInPanelText);

	if(actual_OrangeHRMApplicationLogInPageLogInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	//System.out.println(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");
	Log.info(" Successfully Navigated to the OrangeHRM Application LogIN Page - TEXT Found - PASS ");
	}
	else
	{
	//System.out.println(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
	Log.info(" Failed to Navigate to the OrangeHRM Application LogIN Page - TEXT NOT Found - FAIL ");
	}


	}

	@Test(priority=2,description=" Validating OrangeHRM Application LogIn Functionality Test ")
	public void orangeHRMApplicationLogInTest() throws IOException
	{
	// getting the Test Data from the External File


	logInTestDataFile= new FileInputStream("./src/orangeHRM_ApplicationTestDataFiles/TestData1.xlsx");
	workBook = new XSSFWorkbook(logInTestDataFile);
	logInTestDataSheet= workBook.getSheet("Sheet1");

	logInTestDataRow=logInTestDataSheet.getRow(1);
	logInUserNameRowOfCell=logInTestDataRow.getCell(0);

	String userNameTestData=logInUserNameRowOfCell.getStringCellValue();


	// String userNameTestData="srini"; // TestData assigned to a Variable
	 
	By userNameProperty=By.id(properties.getProperty("logInPageUserNameProperty")); // Property of an element assigned to a variable
	WebElement userName=driver.findElement(userNameProperty); // Identify the element in the Current WebPage
	userName.sendKeys(userNameTestData);// Operation on the Identified WebElement
	Log.info(userNameTestData);

	// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

	// String passwordTestData="Q@Trainer7";

	logInPasswordRowOfCell=logInTestDataRow.getCell(1);
	String passwordTestData=logInPasswordRowOfCell.getStringCellValue();

	By passwordProperty=By.name(properties.getProperty("logInPagepasswordProperty"));
	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys(passwordTestData);
	Log.info(passwordTestData);
	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

	By logInButtonProperty=By.className(properties.getProperty("logInPageLogInButtonProperty"));
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();

	System.out.println();

	// Expected Title should be - OrangeHRM


	String expected_OrangeHRMApplicationHomePageTitle="OrangeHRM";
	// System.out.println(" The expected Title of the OrangeHRM Application HOME Page is :- "+expected_OrangeHRMApplicationHomePageTitle);
	Log.info(" The expected Title of the OrangeHRM Application HOME Page is :- "+expected_OrangeHRMApplicationHomePageTitle);

	String actual_OrangeHRMApplicationHomePageTitle=driver.getTitle();
	//System.out.println(" The actual Title of the OrangeHRM Application Home Page is :- "+actual_OrangeHRMApplicationHomePageTitle);
	Log.info(" The actual Title of the OrangeHRM Application Home Page is :- "+actual_OrangeHRMApplicationHomePageTitle);

	if(actual_OrangeHRMApplicationHomePageTitle.equals(expected_OrangeHRMApplicationHomePageTitle))
	{
	//System.out.println(" Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
	Log.info(" Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
	}
	else
	{
	//System.out.println(" Failed to Navigate to the OrangeHRM Application HOME Page - FAIL ");
	Log.info(" Failed to Navigate to the OrangeHRM Application HOME Page - FAIL ");
	}

	}

	@Test(priority=3,description=" Validating OrangeHRM Application HomePage ")
	public void orangeHRMApplicationValidation_HomePage() throws IOException
	{
	// Validating HOME Page
	// expected Text should have - Admin

	String expected_OrangeHRMApplicationHomePageText="Admin";
	System.out.println(" The Expected TEXT of OrangeHRM Application Home Page is :- "+expected_OrangeHRMApplicationHomePageText);

	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

	// By welComeAdminProperty=By.linkText("Welcome Admin");

	By welComeAdminProperty=By.id(properties.getProperty("orangeHRMApplicationHomePageWelComeAdminProperty"));


	welComeAdmin=driver.findElement(welComeAdminProperty);
	String actual_welComeAdminText=welComeAdmin.getText();

	// System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_welComeAdminText);
	Log.info(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_welComeAdminText);

	if(actual_welComeAdminText.contains(expected_OrangeHRMApplicationHomePageText))
	{
	//System.out.println(" Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
	Log.info(" Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");

	Cell testResultCell=logInTestDataRow.createCell(2);
	testResultCell.setCellValue("Successfully Navigated to the OrangeHRM Application HOME Page - PASS ");
	}

	else
	{
	//System.out.println(" Failed to Navigate to the OrangeHRM Application HOME Page - FAIL ");
	Log.info(" Failed to Navigate to the OrangeHRM Application HOME Page - FAIL ");
	Cell testResultCell=logInTestDataRow.createCell(2);
	testResultCell.setCellValue("Failed to Navigate to the OrangeHRM Application HOME Page - FAIL  ");
	}

	testResultFile = new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/TestData1.xlsx");
	workBook.write(testResultFile);

	}


	@Test(priority=4,description=" Validating OrangeHRM Application LogOut Functionality Test")
	public void orangeHRMApplication_LogOutTest() throws InterruptedException
	{
	welComeAdmin.click();

	// Thread.sleep(5000);



	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	/*
	By logOutProperty=By.linkText("Logout");
	OR
	*/

	// Explicit wait is applied only for a Particular WebElement to be loaded and identified
//	    on the Current Webpage -- Once the WebElement is loaded then WebDriver will
//	       immediately automate that WebElement and will not wait for the Rest of the
//	            given time as an argument when the Object is create

	WebDriverWait wait = new WebDriverWait(driver, 10); // Explicit Wait - it is a smart wait
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));


	By logOutProperty=By.partialLinkText(properties.getProperty("homePagelogOutProperty")); // considering a part of the Text of the LINK as Selector
	WebElement logOut=driver.findElement(logOutProperty);

	logOut.click();

	Log.info(" LogOut Test Successfull ");

	}
}
