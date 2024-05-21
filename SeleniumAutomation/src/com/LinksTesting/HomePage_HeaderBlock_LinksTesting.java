package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage_HeaderBlock_LinksTesting {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(applicationUrlAddress);

		// Identifying the Header Block of the Webpage
		// class="menu-wrap" - property of header Block

		By tsrtcHomePageHeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtcHomePageHeaderBlock=driver.findElement(tsrtcHomePageHeaderBlockProperty);

		// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		// <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		//<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>

		// Header Block ELement Common property is a- tag
		By tsrtcHomePageHeaderBlockLinksProperty=By.tagName("a");
		// going the the Header Block and identifying the elements of the Header Block
		List<WebElement>tsrtcHomePageHeaderBlockLinks=tsrtcHomePageHeaderBlock.findElements(tsrtcHomePageHeaderBlockLinksProperty);

		int tsrtcHeaderBlockLinksCount=tsrtcHomePageHeaderBlockLinks.size();
		System.out.println(tsrtcHeaderBlockLinksCount);

		// Displaying the Names of the Header Block
		for(int arrayIndex=0;arrayIndex<tsrtcHeaderBlockLinksCount;arrayIndex++)
		{
		String tsrtcHomePageHeaderBlocLinkName=
		        tsrtcHomePageHeaderBlockLinks.get(arrayIndex).getText();
		System.out.println(arrayIndex+" - "+tsrtcHomePageHeaderBlocLinkName);
		}

       driver.quit();
		
}
}
