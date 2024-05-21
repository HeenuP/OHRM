package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebTable extends BaseTest
{
	@Test
	public void dynamiceWebTable()
	{

	// Identifying the Block of the WebTable
	// /html/body/div[5]/section[1]/div

	By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
	WebElement webTable=driver.findElement(webTableProperty);

	// Going to the WebTable and finding the number of Rows
	// tr  tag represents to table Row

	By rowProperty=By.tagName("tr");
	List<WebElement>webTableRows=webTable.findElements(rowProperty);

	// to goto every Row of the WebTable
	for(int rowIndex=0;rowIndex<webTableRows.size();rowIndex++)
	{
	// going to a particular Row
	WebElement row=webTableRows.get(rowIndex);


	// going to a particular Row and identify the number of its Corresponding Cells
	By rowofCellProperty=By.tagName("td");
	List<WebElement>rowOfCells=row.findElements(rowofCellProperty);

	// going to every Row of its Corresponding Cells

	for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCells.size();rowOfCellIndex++)
	{
	// going to a Particular row of its Corresponding Cell
	WebElement rowOfCell=rowOfCells.get(rowOfCellIndex);

	// get the WebTable Data from the Row of Cell
	String webTableDataText=rowOfCell.getText();
	System.out.print(webTableDataText+" | ");

	}

	System.out.println();


	}


	}

}
