package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {
	public static void main(String[] args) throws IOException {
		// Identify the File(Excel File) in the System
		FileInputStream excelTestDataFile = new FileInputStream("./src/com/TestDataFiles/TestData1.xlsx");

		// Identify the WorkBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);

		// Identify the Sheet(a particular Sheet in which we have our Test Data) in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		// Create a particular Row in the Sheet
		Row newRow=testDataSheet.createRow(7);

		// Create a particular Row of a Cell in the Row
		Cell newRowOfCell=newRow.createCell(0);

		// set the value into the NewRow of a Cell Created in the Row
		newRowOfCell.setCellValue("Heena");

		//Row row=testDataSheet.createRow(7);
		Cell rowOfCell=newRow.createCell(2);
		rowOfCell.setCellValue("Patel");


		// Save the Excel File - with the path of the location of the System with a name of the file
		// along with the extension of the file with the WorkBook

		FileOutputStream testResultFile = new FileOutputStream("./src/com/TestDataFiles/TestData1.xlsx");
		workBook.write(testResultFile);



		}

		}




		
		
	
