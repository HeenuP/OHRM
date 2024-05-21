package com.ScreenShot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OsmaniaUniversity_SelectLanguage_ScreenShot
{
	WebDriver driver;
	String ApplicationURL="https://www.osmania.ac.in/";	

	public void LaunchApplication() 
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationURL);
		driver.manage().window().maximize();
		}
	
	public void ApplicationClose()
	{
		driver.close();
	}
	public void capturingScreenShots() throws IOException, InterruptedException 
	
	{
		By DropDownProperty=By.id("gtranslate_selector");
	    WebElement DropDown=driver.findElement(DropDownProperty);
	// ELement Common property is -option
	    By LanguagesProperty=By.tagName("option");
	    List<WebElement>Languages=DropDown.findElements(LanguagesProperty);

	    int LanguagesCount=Languages.size();
	    System.out.println("the total number of Languages in dropdown is:"+LanguagesCount);


	    for(int arrayIndex=0;arrayIndex<LanguagesCount;arrayIndex++)
	    {
	       String LanguagesNames=Languages.get(arrayIndex).getText();
	       System.out.println(arrayIndex+" -"+LanguagesNames);
	       
	       Languages.get(arrayIndex).click();
	       Thread.sleep(5000);
	       
	       
	       File linkScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(linkScreenShot, new File("./ApplicationScreenShots/" +arrayIndex+ " - "+ LanguagesNames+".png"));

	    }
	}
	

public static void main(String[] args) throws IOException, InterruptedException
{
	OsmaniaUniversity_SelectLanguage_ScreenShot ScreenShot=new OsmaniaUniversity_SelectLanguage_ScreenShot();
	ScreenShot.LaunchApplication();
	ScreenShot.capturingScreenShots();
	ScreenShot.ApplicationClose();
}
}
	       
	    	 
	      
	    

	


	
	

