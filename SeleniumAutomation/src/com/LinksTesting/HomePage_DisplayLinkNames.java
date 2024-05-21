package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

   public class HomePage_DisplayLinkNames {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();


	   String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	   driver.get(applicationUrlAddress);
	   
	// anchor tag 'a' is only a common property of the links in the Current Webpage

	   By linksProperty=By.tagName("a");
	   List<WebElement>tsrtcHomePageLinks=driver.findElements(linksProperty); // tsrtcHomePageLinks is called as ArrayList


	   int tsrtcHomePageLinksCount=tsrtcHomePageLinks.size();

	   System.out.println(" The number of links on the TSRTC Application Home Page are :- "+tsrtcHomePageLinksCount);

	// getting the names of the Links
	   for(int arrayIndex=0;arrayIndex<tsrtcHomePageLinksCount;arrayIndex++)
	   {
	   String tsrtcHomePage_LinkName=tsrtcHomePageLinks.get(arrayIndex).getText();

	   System.out.println(arrayIndex+" - "+tsrtcHomePage_LinkName);
	   }


	   driver.quit();



	   
	   
   }
   }
	
  