package com.RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestingRadioButtons extends BaseTest
{

public void radioButtons() throws InterruptedException
{

/*
<input type="radio" name="group1" value="Milk">
<input type="radio" name="group1" value="Butter" checked="">
<input type="radio" name="group1" value="Cheese">

<input type="radio" name="group2" value="Water">
<input type="radio" name="group2" value="Beer">
<input type="radio" name="group2" value="Wine" checked="">
*/

By group1RadioButtonsProperty=By.name("group1");
List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonsProperty);

int group1RadioButtonsSize=group1RadioButtons.size();

System.out.println(group1RadioButtons.size());


// Performing a Click operation on the list of Radio Button
for(int group1RadioButtonsArrayIndexClick=0;group1RadioButtonsArrayIndexClick<group1RadioButtonsSize;group1RadioButtonsArrayIndexClick++)
{


group1RadioButtons.get(group1RadioButtonsArrayIndexClick).click();

Thread.sleep(5000);

//getting the status of the Radio Buttons

for(int group1RadionButtonsArrayIndexStatus=0;group1RadionButtonsArrayIndexStatus<group1RadioButtonsSize;group1RadionButtonsArrayIndexStatus++)
{
String group1RadioButtonName=group1RadioButtons.get(group1RadionButtonsArrayIndexStatus).getAttribute("value");
System.out.print(group1RadioButtonName+" - ");

group1RadioButtonName=group1RadioButtons.get(group1RadionButtonsArrayIndexStatus).getAttribute("checked");
System.out.println(group1RadioButtonName);

}

System.out.println();

}


}

public static void main(String[] args) throws InterruptedException
{

TestingRadioButtons radio = new TestingRadioButtons();
radio.applicationLauch();
radio.radioButtons();
radio.applicationClose();

}


}
