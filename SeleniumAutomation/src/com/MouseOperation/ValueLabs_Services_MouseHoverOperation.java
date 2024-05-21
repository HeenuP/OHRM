/*package com.MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ValueLabs.TestingSoftwareDevelopment;

public class ValueLabs_Services_MouseHoverOperation {
    WebDriver driver;
    String ValueLabsApplicationURL="https://www.valuelabs.com/";
    public void LaunchApplication()
    {
    	System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get(ValueLabsApplicationURL);
        driver.manage().window().maximize();    	// Maximize the Browser

    }
    public void softwareDevelopment_Click()
    {
    	By SoftwareDevelopmentProperty=By.id("Software Development");
        WebElement SoftwareDevelopment=driver.findElement(SoftwareDevelopmentProperty);
        SoftwareDevelopment.click();
    }
    public void ApplicationClose()
    {
    	driver.close();
    }
    public static void main(String[] args)
    {
    	TestingSoftwareDevelopment TestingLink= new TestingSoftwareDevelopment();
    	TestingLink.LaunchApplication();
        TestingLink.mouseHoverOperation_Services();
    	//TestingLink.ApplicationClose();
    }
    		
    }*/

package com.MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValueLabs_Services_MouseHoverOperation
{

WebDriver driver;
String applicationUrlAddress="https://www.valuelabs.com/";


public void applicationLaunch()
{

System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
//WebDriver driver = new ChromeDriver();
driver = new ChromeDriver();

driver.get(applicationUrlAddress);

driver.manage().window().maximize(); // Maximize the Browser

}


public void applicationClose()
{
driver.close();
}


public void mouseHoverOperation_Services()
{

// <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="static"> Services  </a>
By servicesProperty=By.linkText("Services");
WebElement services=driver.findElement(servicesProperty);

// Creating an Object for the Actions class to work with Mouse Operation
Actions mouseHoverOperation = new Actions(driver);
mouseHoverOperation.moveToElement(services).build().perform();

}

public static void main(String[] args) {

ValueLabs_Services_MouseHoverOperation mouseOperation = new ValueLabs_Services_MouseHoverOperation();
mouseOperation.applicationLaunch();
mouseOperation.mouseHoverOperation_Services(); // Actions class Object will now perform an operation to moveTo an WebElement on the Current Build - to moveTo a WebELement Services

}

}
  
    
	
	