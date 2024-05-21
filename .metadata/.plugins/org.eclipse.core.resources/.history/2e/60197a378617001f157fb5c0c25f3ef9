package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.OrangeHRMApplicationTesting.BaseTest;
@Test
public class LoginWithMultipleTestData extends BaseTest
{
	
	public void Login() throws IOException
{
 FileInputStream LoginTestData=new FileInputStream("./src/orangeHRM_ApplicationTestDataFiles/LoginTestDataOHRM.xlsx");
 XSSFWorkbook workbook=new XSSFWorkbook(LoginTestData);
 XSSFSheet LoginTestDataSheet=workbook.getSheet("Sheet1");
int RowCount=LoginTestDataSheet.getLastRowNum();
 for(int Rowindex=1;Rowindex<RowCount;Rowindex++)
 {
	Row Rows=LoginTestDataSheet.getRow(Rowindex);	
	 
   int	RowOfCellCount=Rows.getLastCellNum();
   for(int  RowOfcellIndex=0;RowOfcellIndex<RowOfCellCount;RowOfcellIndex++)
   {
	  Cell Cells=Rows.getCell(RowOfcellIndex);
	String  testData=Cells.getStringCellValue();
	System.out.println(testData+ " ");
   }
   System.out.println();
 }
 
}
}

