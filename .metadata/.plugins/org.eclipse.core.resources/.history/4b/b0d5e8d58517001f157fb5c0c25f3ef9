package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations4 
{
	@BeforeTest
 public void  ApplicationLaunch()
 {
	 System.out.println("***************Gmail Application Launch Successfully****************");
 }
	
	@Test(priority=1)
	public void LogInTest()
	{
	System.out.println("  LogIn Functionality Test Successfull ");
	}

	@Test(priority=2)
	public void InBoxTest()
	{
	System.out.println("  InBox Functionality Test Successfull ");
	}

	@Test(priority=3)
	public void composeMailTest()
	{
	System.out.println(" Compose Mail Functionality Test Successfull ");
	}
	@Test(enabled = false)
	public void DraftsMailTest()
	{
	System.out.println(" Drafts Mail Functionality Test Successfull ");
	}

	@Test(priority=5)
	public void sentMailTest()
	{
	System.out.println(" Sent Mail Functionality Test Successfull ");
	}

	@AfterTest // This method will be executed after all the Test cases - it is also not a Functionality
	public void gmailApplicationClose()
	{
	System.out.println(" *********** Gmail Application Closed Successfully ****************");
	}
}
