package com.HiddenElementTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValueLabs_Services_SoftwareDevelopment_Click
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
		public void mouseHoverOperation_Services()
		{

		// <a class="nav-link dropdown-toggle" href="#" data-bs-toggle="static"> Services  </a>
		By servicesProperty=By.linkText("Services");
		WebElement services=driver.findElement(servicesProperty);

		// Creating an Object for the Actions class to work with Mouse Operation
		Actions mouseHoverOperation = new Actions(driver);
		mouseHoverOperation.moveToElement(services).build().perform();

		}
		public void sofwareDevelopmentTest()
		{

		// <a href="https://www.valuelabs.com/services/custom-software-development/">Software Development</a>

		By softwareDevelomentProperty=By.linkText("Software Development");
		WebElement softwareDeveloment=driver.findElement(softwareDevelomentProperty);
		softwareDeveloment.click();

		String softwareDevelopmentWebPageTitle=driver.getTitle();

		System.out.println(" The title of the WebPage is :- " + softwareDevelopmentWebPageTitle);

		}
		public static void main(String[] args) 
		{
			ValueLabs_Services_SoftwareDevelopment_Click sdT = new ValueLabs_Services_SoftwareDevelopment_Click();
			sdT.applicationLaunch();
			sdT.mouseHoverOperation_Services();
			sdT.sofwareDevelopmentTest();
			sdT.applicationClose();

		}
		}

		