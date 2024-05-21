package com.orangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript
{
	WebDriver driver;
	String OrangeHRM_ApplicationURL="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	 
	FileInputStream loginPageTextTestData;
	XSSFWorkbook loginPageTextTestDataworkbook;
	XSSFSheet loginPageTextTestDataSheet;
	Row loginPageTextTestDataSheetRow;
	Cell loginPageTextTestDataSheetRowOfACell;
	 Cell Actual_LoginPagetitleCell;
	 Cell	RowOfCell;
	 Cell ActualHomePageTextRowOfCell;
	 Cell Expected_HomePageText;
	 Cell TextResult;
	 
	FileOutputStream TestResult;
public void OrangeHRM_ApplicationLaunch()
{
	System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(OrangeHRM_ApplicationURL);
	driver.manage().window().maximize();
}
public void Validating_LoginPageText() throws IOException
{
	By Actual_LoginPageTextProperty=By.id("logInPanelHeading");
	WebElement Actual_LoginPageTextElement=driver.findElement(Actual_LoginPageTextProperty);
	String Actual_LoginPageText=Actual_LoginPageTextElement.getText();
	System.out.println("The Actual Login Page Text Is:"+Actual_LoginPageText);
	
	loginPageTextTestData=new FileInputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
	 loginPageTextTestDataworkbook =new XSSFWorkbook(loginPageTextTestData);
	 loginPageTextTestDataSheet=loginPageTextTestDataworkbook.getSheet("LogInTestData");
	loginPageTextTestDataSheetRow=loginPageTextTestDataSheet.getRow(1);
	 loginPageTextTestDataSheetRowOfACell=loginPageTextTestDataSheetRow.getCell(2);
	loginPageTextTestDataSheetRowOfACell.setCellValue(Actual_LoginPageText);
	 TestResult=new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
	loginPageTextTestDataworkbook.write(TestResult);
	
	
	Cell loginPageTextTestDataSheetRowOfCell=loginPageTextTestDataSheetRow.getCell(0);  
	String Expected_loginPageText=loginPageTextTestDataSheetRowOfCell.getStringCellValue();
    System.out.println("The Expected Login Page Text is:"+Expected_loginPageText);
    
    if(Actual_LoginPageText.equals(Expected_loginPageText))
    {
    	System.out.println("Actual Login Page Text is Matched with Expected Login Page Text-PASS");
    	Cell TextResult=loginPageTextTestDataSheetRow.getCell(03);
    	TextResult.setCellValue("Actual Login Page Text is Matched with Expected Login Page Text-PASS");
    	
       
    }
    else
    {
    	System.out.println("Actual Login Page Text is Not Matched with Expected Login Page Text-FAIL");
    	Cell TextResult=loginPageTextTestDataSheetRow.getCell(03);
    	TextResult.setCellValue("Actual Login Page Text is Not Matched with Expected Login Page Text-FAIL");
    	
    }
    System.out.println();
}

    
 public void validatingLoginPageTitle() throws IOException, InterruptedException
 {
   String Actual_LoginPageTitle=driver.getTitle();
   System.out.println("The Actual LoginPage Title is:"+Actual_LoginPageTitle);
 Actual_LoginPagetitleCell=loginPageTextTestDataSheetRow.getCell(5);
 Actual_LoginPagetitleCell.setCellValue(Actual_LoginPageTitle);
 TestResult=new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
 loginPageTextTestDataworkbook.write(TestResult);
  
 Cell Expected_LoginPagetitleCell=loginPageTextTestDataSheetRow.getCell(4);
String Expected_LoginPageTitle=Expected_LoginPagetitleCell.getStringCellValue();
System.out.println("The Expected Login Page Title is:"+Expected_LoginPageTitle); 
  
if(Actual_LoginPageTitle.equals(Expected_LoginPageTitle))
{
	System.out.println("Actual Login Page Title is Matched with Expected Login Page Title-PASS");
	Cell TextResult=loginPageTextTestDataSheetRow.getCell(6);
	TextResult.setCellValue("Actual Login Page Title is Matched with Expected Login Page Title-PASS");
	
}
else
{
	System.out.println("Actual Login Page Title is Not Matched with Expected Login Page Title-Fail");
	Cell TextResult=loginPageTextTestDataSheetRow.getCell(6);
	TextResult.setCellValue("Actual Login Page Title is Not Matched with Expected Login Page Title-Fail");
	
}
System.out.println();
 }
public void LoginWithData() throws InterruptedException, IOException
{
	
	  int RowCount=loginPageTextTestDataSheet.getLastRowNum();
     for(int RowIndex=1;RowIndex<RowCount;RowIndex++)
     {
    	Row Row=loginPageTextTestDataSheet.getRow(RowIndex);
       	RowOfCell=Row.getCell(7);
      String UserNameTestData=RowOfCell.getStringCellValue();
      System.out.println(UserNameTestData);
      
      By UsernameProperty=By.id("txtUsername");
      WebElement Username=driver.findElement(UsernameProperty);
      Username.sendKeys(UserNameTestData);
       
      RowOfCell=Row.getCell(8);
      String  PassWordTestData=RowOfCell.getStringCellValue();
      System.out.println(PassWordTestData);
      
      By passWordProperty=By.name("txtPassword");
      WebElement PassWordProperty=driver.findElement(passWordProperty);
      PassWordProperty.sendKeys(PassWordTestData);
      
      By LoginProperty=By.className("button");
      WebElement Login=driver.findElement(LoginProperty);
      Login.click();
      
      //Validating HomePage  
     //<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
     By WelcomeProperty=By.partialLinkText("Welcome");
     WebElement Welcome=driver.findElement(WelcomeProperty);
    String Actual_HomePageText=Welcome.getText();
    System.out.println("The Actual Home Page Text Is:"+Actual_HomePageText);
    
    ActualHomePageTextRowOfCell= loginPageTextTestDataSheetRow.getCell(10);
   ActualHomePageTextRowOfCell.setCellValue(Actual_HomePageText);
   TestResult=new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
   loginPageTextTestDataworkbook.write(TestResult);
  
  Expected_HomePageText=loginPageTextTestDataSheetRow.getCell(9);
 String ExpectedHomePageText=Expected_HomePageText.getStringCellValue();
 System.out.println("The Expected Home Page Text is:"+ExpectedHomePageText);
if(Actual_HomePageText.contains(ExpectedHomePageText))
{
	System.out.println("Successfully Navigated to Home Page-PASS");
	TextResult=loginPageTextTestDataSheetRow.getCell(11);
	TextResult.setCellValue("Successfully Navigated to Home Page-PASS");
	Welcome.click();
	Thread.sleep(300);

	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	  By LogoutProperty=By.linkText("logout");
	   WebElement  Logout=driver.findElement(LogoutProperty);  
	   Logout.click();
	
}
else
{
	System.out.println("Failed to  Navigated to Home Page-FAIL");
	TextResult=loginPageTextTestDataSheetRow.getCell(11);
	TextResult.setCellValue("Failed to  Navigated to Home Page-FAIL");
	
   File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(ScreenShot, new File("./ApplicationScreenShots/"+RowIndex+".png"));//./ApplicationScreenShots/"+tsrtcHomePageHeaderBlocLinkName+".png"

}
}   
   
}
 public void CloseApplication()
 {
	 driver.close();
 }
 
public static void main(String[] args) throws IOException, InterruptedException
{
	LoginScript Login=new LoginScript();
	Login.OrangeHRM_ApplicationLaunch();
	Login.Validating_LoginPageText();
	Login.validatingLoginPageTitle();
	Login.LoginWithData();
	Login.CloseApplication();
	
	
}
}