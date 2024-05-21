package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Value_HomePage_ScreenShot 
{
  WebDriver driver;
  String applicationUrlAddress="https://www.valuelabs.com/";

  public void applicationLaunch()
  {

  System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
  //WebDriver driver = new ChromeDriver();
  driver = new ChromeDriver();

  driver.get(applicationUrlAddress);

  driver.manage().window().maximize();

  }


  public void applicationClose()
  {
  driver.close();
  }


  public void capture_valueLabsHomePageScreenShot() throws IOException
  {
  // TakesScreenshot - its an interface of the Selenium
  // driver - is an object of a Class
  // an interface is binded with an object of the Class - Type Casting
  // OutputType - its an interface in Selenium
  // FileUtils - its a class from Apache POI - commons.io

  File valueLabsScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  // the captured screenShot should be save to the location of the Project
  FileUtils.copyFile(valueLabsScreenShot, new File("./ApplicationScreenShots/valueLabsHomePage.png"));

  }

  public static void main(String[] args) throws IOException {

  Value_HomePage_ScreenShot screenShot = new Value_HomePage_ScreenShot();
  screenShot.applicationLaunch();
  screenShot.capture_valueLabsHomePageScreenShot();
  screenShot.applicationClose();

  }

  }

