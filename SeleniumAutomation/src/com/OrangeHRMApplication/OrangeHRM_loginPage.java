package com.OrangeHRMApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_loginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sohai\\eclipse-workspace3\\SeleniumWebdriver\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		 //chrome.get("http://google.com");
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
        chrome.get(applicationUrlAddress);
        
		String ActualOrangeHRMtittle=chrome.getTitle();
		System.out.println("The Actual tittle of ;the orange HRM Application is="+ActualOrangeHRMtittle);
		
		
		 String ExpectedOrangeHRMtittle="OrangeHRM";
		 System.out.println("The expected tittle of the orange HRM Application is="+ExpectedOrangeHRMtittle);
		 
		 if(ActualOrangeHRMtittle.equals(ExpectedOrangeHRMtittle))
			{
				System.out.println("Matched");
			}
			else 
			{
				System.out.println("Not matched");
			}
		
		chrome.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		 String OrangeHRMHomePageCurrentUrlAddress=chrome.getCurrentUrl();
		 System.out.println("The current URL of the home page of OrangeHRM is:-"+OrangeHRMHomePageCurrentUrlAddress);

		
		 String Actual_OrangeHRMUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		 chrome.get(Actual_OrangeHRMUrlAdress);
		 System.out.println("The actual URL Adress of Orange HRM application is:-"+Actual_OrangeHRMUrlAdress);
		 
		 String Expected_OrangeHRMUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1";
		 chrome.get(Expected_OrangeHRMUrlAdress);
		 System.out.println("The Expected URL Adress of Orange HRM application is:-"+Expected_OrangeHRMUrlAdress);
		 
		 
		 if(Actual_OrangeHRMUrlAdress.contains(Expected_OrangeHRMUrlAdress))
		 {
			 System.out.println("The Actual Orange HRM Url Address Exist in Expected Orange HRM Url Address-PASS");
		 }
		 else
		 {
			 System.out.println("The Actual Orange HRM Url Address NOT Exist in Expected Orange HRM Url Address-FAIL");

		 }
		 /*
		  <input name="txtUsername" id="txtUsername" type="text">
          <-tag
          input-value

          name=attribute/locator
          txtUsername=value/selector

          id=attribute/locator
          txtUsername=value/selector

          type=attribute
          text=value
		  */
		String userNameTestData="HeenuP";
		By UsernameProperty=By.id("txtUsername");
		WebElement userName=chrome.findElement(UsernameProperty);
		userName.sendKeys(userNameTestData);
		
		chrome.findElement(By.id("txtPassword")).sendKeys("Heenu@9090");
	    chrome.findElement(By.className("button")).click();
	    
	    By linksproperty=By.tagName("a");
	    List<WebElement>links=chrome.findElements(linksproperty);
	    int linkscount=links.size();
	    System.out.println("the total links of the orange hrm is:"+linkscount);
	    
	   for(int arrayindex=0; arrayindex<linkscount;arrayindex++)
	   {
		  String linksname=links.get(arrayindex).getText();
		  System.out.println(arrayindex+"-"+linksname);
	   }
	    
	    chrome.quit();
	  
	}

}
