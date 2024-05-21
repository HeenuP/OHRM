package com.IsDisplayed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBS_HomePage_DisplayVisibleLinkNames {

	    WebDriver driver;
    	String applicationUrlAddress="https://www.dbs.com/in/index/default.page#wm";
    	
    	public void ApplicationLaunch()
    	{
    		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
    		driver=new ChromeDriver();
    		driver.get(applicationUrlAddress);
    	}
    	public void Application_linksNames()
    	{
    		By LinksNamesProperty=By.tagName("a");
    	List<WebElement>LinksNames=driver.findElements(LinksNamesProperty);
    	int HomePageLinksNamecount=LinksNames.size();
    	System.out.println("The total number of links on the home page is:"+HomePageLinksNamecount);
    	for(int arrayindex=0;arrayindex<HomePageLinksNamecount;arrayindex++)
    	{
    		if(LinksNames.get(arrayindex).isDisplayed()) //for not getting the space for hidden links
    		{
    	String HomePageLinksNames=LinksNames.get(arrayindex).getText();
    	System.out.println(arrayindex+" - "+HomePageLinksNames);
    		}
    	}}
    	
    	public void ApplicationClose()
    	{
    		driver.close();
    	}
    	public static void main(String[] args) {
    		DBS_HomePage_DisplayVisibleLinkNames homePage=new DBS_HomePage_DisplayVisibleLinkNames();
    		homePage.ApplicationLaunch();
    		homePage.Application_linksNames();
    		homePage.ApplicationClose();

		}
    	


	

}