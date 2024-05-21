package com.ValueLabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestingSoftwareDevelopment {

     WebDriver driver;
    String ValueLabsApplicationURL="https://www.valuelabs.com/";
    public void LaunchApplication()
    {
    	System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get(ValueLabsApplicationURL);
    }
    public void mouseHoverOperation_Services()
    {
    By ServiceProperty=By.linkText("Services");
   WebElement Service=driver.findElement(ServiceProperty);
   Actions mouseHoverOperation=new Actions(driver);
   mouseHoverOperation.moveToElement(Service).build().perform();
    }
   
    public void ApplicationClose()
    {
    	driver.close();
    }
    public static void main(String[] args)
    {
    	//TestingSoftwareDevelopment TestingLink= new TestingSoftwareDevelopment();
    	//TestingLink.LaunchApplication();
    	//TestingLink.mouseHoverOperation_Services();
    	//TestingLink.ApplicationClose();
    }
    		
    }


