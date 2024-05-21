


package com.OHRM;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_ReadAndWriteOperation {
public static void main(String[] args) throws IOException, InterruptedException
{

System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
   ChromeDriver driver = new ChromeDriver();

   String applicationUrlAddress="http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
        driver.get(applicationUrlAddress);
        driver.manage().window().maximize();

            //Invalid credentials
         String userNameTestData="Ad";
    By userNameProperty=By.id("txtUsername");
    WebElement username=driver.findElement(userNameProperty);
    username.sendKeys(userNameTestData);

    String PasswordTestData="fdjiwdwn";
    By Passwordproperty=By.id("txtPassword");
    WebElement Password=driver.findElement(Passwordproperty);
    Password.sendKeys(PasswordTestData);

    By LoginButtonProperty=By.className("button");
    WebElement LoginButton=driver.findElement(LoginButtonProperty);
            LoginButton.click();
           
         File linkScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(linkScreenShot, new File("./ApplicationScreenShots/"+userNameTestData+ " " +PasswordTestData  +".png"));

           
          //Actual - Invalid Credentials  login page text
            // <span id="spanMessage">Invalid credentials</span>
            By Invalid_LoginPageTextProperty=By.id("spanMessage");
            WebElement Invalid_LoginPageText=driver.findElement(Invalid_LoginPageTextProperty);
            String Actual_Invalid_LoginPageText=Invalid_LoginPageText.getText();
            System.out.println("The Actual login page text is :" +Actual_Invalid_LoginPageText);
   
         // Actual login page text
        //<div id="logInPanelHeading">LOGIN Panel</div>
           By LoginPageTextProperty=By.id("logInPanelHeading");
           WebElement LoginPageText=driver.findElement(LoginPageTextProperty);
           String Actual_LoginPageText=LoginPageText.getText();
           System.out.println("The Actual login page text is :" +Actual_LoginPageText);
   
            //Actual login page text- write operation
            FileInputStream excelLogInTestDataFile = new FileInputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
            XSSFWorkbook LogInTestDataworkBook = new XSSFWorkbook(excelLogInTestDataFile);
            XSSFSheet A_LogIntestDataSheet = LogInTestDataworkBook.getSheet("LogInTestData");
            Row LogInTestDataRow=A_LogIntestDataSheet.getRow(1);
            Cell A_LogInTestDatarowOfCell=LogInTestDataRow.createCell(2);
            A_LogInTestDatarowOfCell.setCellValue(Actual_LoginPageText + "&" + Actual_Invalid_LoginPageText);
    FileOutputStream TestResult = new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
    LogInTestDataworkBook.write(TestResult);
   
   
    //Expected login page text from an external excel file
    Row E_LogInTestDatasheetOfaRow1=A_LogIntestDataSheet.getRow(1);
    Cell E_LogInTestDatarowOfACell1=E_LogInTestDatasheetOfaRow1.getCell(0);
    String Expected_LoginPageText=E_LogInTestDatarowOfACell1.getStringCellValue();
    System.out.println("The Expected login page text is :"+ Expected_LoginPageText);
   
    //Expected- Invalid Credentials  login page text from an external excel file
    Row Invalid_LogInTestDatasheetOfaRow1=A_LogIntestDataSheet.getRow(1);
    Cell Invalid_LogInTestDatarowOfACell1=Invalid_LogInTestDatasheetOfaRow1.getCell(1);
    String Expected_InvalidLoginPageText=Invalid_LogInTestDatarowOfACell1.getStringCellValue();
    System.out.println("The Expected Invalid login page text is :"+ Expected_InvalidLoginPageText);
   
   
    //Validating actual with expected result
    if(Actual_LoginPageText.equals(Expected_LoginPageText) && Actual_Invalid_LoginPageText.equals(Expected_InvalidLoginPageText))
    {
    System.out.println("Login Page Text matches : Pass");
   
    Cell TestResult1=LogInTestDataRow.getCell(03);
    TestResult1.setCellValue("Login Page Text matches : Pass");
    FileOutputStream TestResult11=new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
    LogInTestDataworkBook.write(TestResult11);
    }
    else
    {
    System.out.println("Login Page Text Does Not Match");
   
    Cell TestResult1=LogInTestDataRow.getCell(03);
    TestResult1.setCellValue("Login Page Text Does Not Match");
    FileOutputStream TestResult11=new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
    LogInTestDataworkBook.write(TestResult11);
    }
   
    System.out.println();






//Expected login page title
         FileInputStream excelLogInPageTitleFile = new FileInputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
        XSSFWorkbook LogInPageTitleworkBook = new XSSFWorkbook(excelLogInPageTitleFile);
        XSSFSheet LogInPageSheet = LogInPageTitleworkBook.getSheet("LogInTestData");
        Row LogInPageRow=LogInPageSheet.getRow(1);
        Cell E_LogInPagerowOfACell=LogInPageRow.getCell(4);
      String Expected_LoginPageTitle=E_LogInPagerowOfACell.getStringCellValue();
    System.out.println("The Expected Login Page Title is :"+ Expected_LoginPageTitle);
   
   
    // Actual login page title
    String Actual_LogInPageTitle=driver.getTitle();
    System.out.println("The Actual Login Page Title is :"+Actual_LogInPageTitle);
   
    Row A_LogInPageRow=LogInPageSheet.getRow(1);
        Cell A_LogInPagerowOfACell=A_LogInPageRow.createCell(5);
        A_LogInPagerowOfACell.setCellValue(Actual_LogInPageTitle);
        FileOutputStream TestResult1 = new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
        LogInPageTitleworkBook.write(TestResult1);
       

      //Validating actual login page title with expected result
    if(Actual_LogInPageTitle.equals(Expected_LoginPageTitle))
    {
    System.out.println("Login Page Title matches : Pass");
   
    Cell TestResult21=A_LogInPageRow.getCell(6);
    TestResult21.setCellValue("Login Page Title matches : Pass");
    FileOutputStream TestResult23=new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
    LogInPageTitleworkBook.write(TestResult23);
    }
    else
    {
    System.out.println("Login Page Title Does Not Match : Fail");
   
    Cell TestResult21=A_LogInPageRow.getCell(6);
    TestResult21.setCellValue("Login Page Title Does Not Match : Fail");
    FileOutputStream TestResult23=new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
    LogInPageTitleworkBook.write(TestResult23);
    }
   
    System.out.println();

   
    //valid username and password
    String a="Admin";
    String b="Qedge123!@#";

 
    //identifying the file(Excel) in the System
    int rowCount=LogInPageSheet.getLastRowNum();
    System.out.println("The number Active rows in the sheet - "+rowCount);

    for(int index=1;index<rowCount;index++)
    {
    Row ExcelTestDataRow=LogInPageSheet.getRow(index);
      System.out.println("The index number of current Row - "+index);
     
       //Going to particular row of cell
      int rowOfCell=7;

      Cell ExcelTestDataRowOfCell=ExcelTestDataRow.getCell(rowOfCell);
      String  TestDataUserNameValue=ExcelTestDataRowOfCell.getStringCellValue();
      System.out.println("The Testdata for the UserName - "+TestDataUserNameValue);
     
      //<input name="txtUsername" id="txtUsername" type="text">
      By UsernameProperty=By.id("txtUsername");
      WebElement Username=driver.findElement(UsernameProperty);
      Username.sendKeys(TestDataUserNameValue);

       
      //Going to next particular row of cell
      int rowOfCell1=8;
     
      ExcelTestDataRowOfCell=ExcelTestDataRow.getCell(rowOfCell1);
      String TestDataPasswordValue=ExcelTestDataRowOfCell.getStringCellValue();
      System.out.println("The Testdata for the Password - "+TestDataPasswordValue);
       
      // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
      By passWordProperty=By.name("txtPassword");
      WebElement PassWordProperty=driver.findElement(passWordProperty);
      PassWordProperty.sendKeys(TestDataPasswordValue);
           
      By LoginProperty=By.className("button");
      WebElement Login=driver.findElement(LoginProperty);
      Login.click();
     
      //validating that login page is navigating into home page or not
      if(TestDataUserNameValue.equals(a) && TestDataPasswordValue.equals(b)) {

      By WelcomeAdminProperty=By.linkText("Welcome Suresh");
      WebElement welcomeAdmin=driver.findElement(WelcomeAdminProperty);

      Row ExpectedHomePageRow=LogInPageSheet.getRow(1);
             Cell E_ExpectedHomePagerowOfACell=ExcelTestDataRow.getCell(9);
            String Expected_HomePageText=E_ExpectedHomePagerowOfACell.getStringCellValue();
          System.out.println("The Expected Login Page Title is :"+ Expected_HomePageText);
     
     
     
      String Actual_HomePageText=welcomeAdmin.getText();
      System.out.println("The Actual  is Element Text - "+Actual_HomePageText);
      Row ActualHomePageRow=LogInPageSheet.getRow(index);
             Cell A_HomePagerowOfACell=ActualHomePageRow.createCell(10);
             A_HomePagerowOfACell.setCellValue(Actual_HomePageText);
             
     
      // Validating orangeHrm Home Page
      if(Actual_HomePageText.contains(Expected_HomePageText))
      {
      System.out.println(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");


         Cell logInTestResultRowOfCell=ExcelTestDataRow.createCell(11);
         logInTestResultRowOfCell.setCellValue("Succesfully Navigated to OrangeHRM Application HomePage - PASS");

      }
      else
      {
      System.out.println(" Failed to Navigated to OrangeHRM Application HomePage - FAIL");

         Cell logInTestResultRowOfCell=ExcelTestDataRow.createCell(11);
         logInTestResultRowOfCell.setCellValue(" HomePage - FAIL");
      }
     
        By welcomeAdminProperty=By.linkText("Welcome Suresh");
    WebElement welcomeSuresh=driver.findElement(welcomeAdminProperty);

          welcomeSuresh.click();

          Thread.sleep(5000); // `1sec =1000

          By logOutProperty=By.linkText("Logout");
          WebElement logOut=driver.findElement(logOutProperty);
          logOut.click();
       
    }
   
    else
    {
    System.out.println(" Failed to Navigated to OrangeHRM Application HomePage - FAIL");

      Cell logInTestResultRowOfCell=ExcelTestDataRow.createCell(11);
      logInTestResultRowOfCell.setCellValue("  Failed to Navigated to OrangeHRM Application HomePage - FAIL");

    }
   

    System.out.println();
   
    FileOutputStream LogInTestResult = new FileOutputStream("./src/orangeHRM_ApplicationTestDataFiles/OrangeHRM_LogInTestDataFile.xlsx");
         LogInPageTitleworkBook.write(LogInTestResult);
   
       
    }

    driver.close();
}


}