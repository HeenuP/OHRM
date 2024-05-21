 /*package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{
	@BeforeTest
	public void LaunchApplication()
	{
		System.out.println("********gmail Application launch successfully***********");
	}
	
	@Test
	public void loginTest()
	{
		System.out.println("Login functionality test successful");
	}
	
	@Test
	public void ComposeMailTest()
	{
		System.out.println("Compose mail functionality test successful");
	}
	
	@Test
	public void DraftsmailTest()
	{
	System.out.println(" Drafts Mail Functionality Test Successful ");
	}
	
	@Test
	public void SentMailTest()
	{
		System.out.println("sent mail functionality test successfully");
	}
	
	@AfterTest
	public void gmailApplicationClose()
	{
		System.out.println("*********Gmail Application Closed successfully**********");
	}
} 
/*
OUT PUT:

[RemoteTestNG] detected TestNG version 7.4.0 
********gmail Application launch successfully***********
Compose mail functionality test successful
 Drafts Mail Functionality Test Successful 
sent mail functionality test successfully
Login functionality test successful
*********Gmail Application Closed successfully**********
PASSED: ComposeMailTest
PASSED: SentMailTest
PASSED: loginTest
PASSED: DraftsmailTest

===============================================
    Default test
    Tests run: 4, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 4, Passes: 4, Failures: 0, Skips: 0
===============================================



*/


package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{

@BeforeTest
public void gmailApplicationLaunch() // this Method is Executed Prior to all the Test Cases
// it is not a Functionality under Test Statements  

{
System.out.println(" ******* Gmail Application Launch Successfully ********" );
}


// Any functionality of an application which is under Test Should be always be written using the
//     TestNG Annotation @Test
// A Class can be Implemented with any number of Test Cases

// If a Class contains multiple Test Cases then the Test Cases will be executed Based on the
//    alphabetical order of the Given Test Case Names

// If a class contains multiple Test Cases - then the Test cases will be executed based on the
//      alphabetical Order of the Given Test case Names considering the Upper case letter of the
//         given test case Names

@Test
public void LogInTest()
{
System.out.println("  LogIn Functionality Test Successfull ");
}


@Test
public void composeMailTest()
{
System.out.println(" Compose Mail Functionality Test Successfull ");
}

@Test
public void DraftsMailTest()
{
System.out.println(" Drafts Mail Functionality Test Successfull ");
}

@Test
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
