package com.AmazonHiddenElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HomePage_HelloSignIN {
	WebDriver driver;
	String AmazonApplicationURL="https://www.amazon.in/";
	
	public void AmazonApplicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(AmazonApplicationURL);
		driver.manage().window().maximize();
	}
	public void AmazonApplicationClose()
	{
		driver.close();
	}
	/*
  <a href="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=inflex&amp;openid.mode=checkid_setup&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0" class="nav-a nav-a-2   nav-progressive-attribute" data-nav-ref="nav_ya_signin" data-nav-role="signin" data-ux-jq-mouseenter="true" id="nav-link-accountList" tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav-link-accountList" data-csa-c-content-id="nav_ya_signin" data-csa-c-id="anlwo6-jvy82q-t3y8er-1wwv5a">
  <div class="nav-line-1-container"><span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span></div>
  <span class="nav-line-2 ">Account &amp; Lists<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
  </span>    //id="nav-link-accountList"
  </a>
	 */
	public void AmazonApplication_SingIn_MouseHover()
	{
	By SingInProperty=By.id("nav-link-accountList");
    WebElement SignIN=driver.findElement(SingInProperty);
    Actions SingInMouseHover=new Actions(driver);
    SingInMouseHover.moveToElement(SignIN).build().perform(); 
	}
	
	//<span class="nav-text">Your Orders</span>
	public void HidenElement_YourOrdeer_click()
	{
	By YourOrderProperty=By.className("nav-text");
    WebElement YourOrder=driver.findElement(YourOrderProperty);
    YourOrder.click();
	}
   public static void main(String[] args) 
   {
	   Amazon_HomePage_HelloSignIN Hello=new Amazon_HomePage_HelloSignIN();
	   Hello.AmazonApplicationLaunch();
	   Hello.AmazonApplication_SingIn_MouseHover();
	   Hello.HidenElement_YourOrdeer_click();
	  Hello.AmazonApplicationClose();
   }
}
