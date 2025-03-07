package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OsmaniaUniversity_SelectLanguage extends BaseTest
{

public void dropDownTesting()
{
// Select Languages Drop Down Propery
//  id="gtranslate_selector"

By selectLaunguagesProperty=By.id("gtranslate_selector");
WebElement selectLaunguagesDropDown=driver.findElement(selectLaunguagesProperty);


// finding the number of Optional Values in the DropDown

// <option value="en|hi">Hindi</option>
// <option value="en|fr">French</option>
// <option value="en|nl">Dutch</option>

By languagesProperty=By.tagName("option");
List<WebElement>selectLanguages=selectLaunguagesDropDown.findElements(languagesProperty);

int selectLanguagesCount=selectLanguages.size();
System.out.println(" The Number of Languages in the Select Language DropDow are :- "+selectLanguagesCount);

// getting the Names of the DropDown

for(int arrayIndex=0;arrayIndex<selectLanguagesCount;arrayIndex++)
{
String language=selectLanguages.get(arrayIndex).getText();
System.out.println(language);
}



// * Selecting an Optional Value from the DropDown

Select languageSelection = new Select(selectLaunguagesDropDown);

// languageSelection.selectByIndex(8); // index starts with index 0
// languageSelection.selectByValue("en|hi"); // selectByValue method should be passed with String type
 //   as an Argument ( the attribute value should be passed as
//     argument of String type )

languageSelection.selectByVisibleText("Thai"); //  selectByVisibleText - should be provided with
// String type of data -

languageSelection.selectByVisibleText("Telugu");

// Deselection of Selected Optional Value from the DropDow

// languageSelection.deselectByIndex(7); // Deselecting the Selected Option value - * it is not
 //   mandatory to use a Similar type of Method used
//     for making a Selection of the Option value - we
 //      can use any of the Method for deselection

// languageSelection.deselectAll(); // this method is used to DeSelect all the Selected
//    Optional Values from the DropDown


}


public static void main(String[] args) {

OsmaniaUniversity_SelectLanguage languages = new OsmaniaUniversity_SelectLanguage();
languages.applicationLauch();
languages.dropDownTesting();
//languages.applicationClose();
}

}
