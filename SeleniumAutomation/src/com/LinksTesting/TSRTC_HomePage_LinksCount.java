package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_LinksCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sohai\\eclipse-workspace3\\SeleniumWebdriver\\browserDriverFiles\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        
         String application_URLAddress ="https://www.tsrtconline.in/oprs-web/";
         driver.navigate().to(application_URLAddress);
         
         //String CurrentUrl=driver.getCurrentUrl();
        // System.out.println("The current url is:"+CurrentUrl);
         
         //String TittleOfTsrtc=driver.getTitle();
         //System.out.println("The tittle of the tsrtc is:"+ TittleOfTsrtc);
         
         
           
      // anchor tag 'a' is only a common property of the links in the Current Webpage
    By Linksproperty=By.tagName("a");
    List<WebElement>Links =driver.findElements(Linksproperty); //List<WebElement>tsrtcHomePageLinks=driver.findElements(linksProperty); 
    int LinksCount=Links.size();
    System.out.println("The links coutnt of TSRTC home page is:-"+ LinksCount);
    for(int arrayindex=0;arrayindex<LinksCount;arrayindex++)
    {
    	 String linksNames=Links.get(arrayindex).getText();
    	 System.out.println(arrayindex + " - " + linksNames);
    }
        
    driver.close();
	}
}
