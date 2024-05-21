package com.OrangeHRMApplicationTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
@Test
public class OrangeHRMLOGIN extends BaseTest
{
public void LoginTest() throws IOException
{
	FileInputStream TestData=new FileInputStream("./src/orangeHRM_ApplicationTestDataFiles/TestData1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(TestData);
	XSSFSheet TestDataSheet=workbook.getSheet("Sheet1");
	Row TestDataSheetRow=TestDataSheet.getRow(1);
    Cell	UserNameSheetRowOfCell=TestDataSheetRow.getCell(0);
   String userName=UserNameSheetRowOfCell.getStringCellValue();
    Cell  PasswordSheetRowOfCell=TestDataSheetRow.getCell(1);
   String Password=PasswordSheetRowOfCell.getStringCellValue();
    
    
   By UserNameProperty=By.id("txtUsername");
  WebElement UserNameElement=driver.findElement(UserNameProperty);
  UserNameElement.sendKeys(userName);
  
 By PasswordProperty=By.id("txtPassword");
WebElement PasswordElement=driver.findElement(PasswordProperty);
PasswordElement.sendKeys(Password);

  By logInPageLogInButtonProperty=By.className("button");
  WebElement LoginButton=driver.findElement(logInPageLogInButtonProperty);
  LoginButton.click();
}

	

}
