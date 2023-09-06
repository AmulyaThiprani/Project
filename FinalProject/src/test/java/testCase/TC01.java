package testCase;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import pages.HomePage;
import pages.loginpage;
import pages.myaccount;
import testBase.webtestbase;

public class TC01 extends webtestbase{
	myaccount myaccount;
	HomePage Homepage;
	loginpage loginpage;
	
//Loading the config file
    public TC01(){
        super();
    }
    
	@BeforeMethod
	public void BeforeMethod()
	{
		//Loading the driver file and eatablishing the connection ,loading the url
	initialization();
	myaccount = new myaccount();	
	 Homepage = new HomePage();
     loginpage = new loginpage();     
 }
//Login credantial
	  @Test
		
 public void verifyLoginWithValidCredential(){
     SoftAssert softAssert = new SoftAssert();
     Homepage.userSearchClick();
     loginpage.login(prop.getProperty("mobile") ,prop.getProperty("password"));
   //softAssert.assertEquals(myaccount.getTextOFMYAccountPage(), "My Account", "My Account text should be match");
     softAssert.assertAll();
 }
 
//for typing search
// @Test

//mouse hovering on user
			
 @Test
 public void verifyMouseHover(){
     SoftAssert softAssert = new SoftAssert();
     myaccount.mouseHover();
     softAssert.assertAll();
 }
			 
//scroll down upto helpOption 
 @Test
 public void verifyScrollDown(){
     SoftAssert softAssert = new SoftAssert();
     myaccount.scrollDownMethod();
     softAssert.assertAll();
 }
 
//scroll up upto returnOrderoption 
 @Test
 public void verifyScrollUp(){
     SoftAssert softAssert = new SoftAssert();
     myaccount.scrollUpMethod();
     softAssert.assertAll();
 }
 
 
 
//click help option and switching to that window
 @Test
 public void verifyGetWindowHandle(){
     SoftAssert softAssert = new SoftAssert();
     myaccount.windowHandle();
     softAssert.assertAll();
 }

 @Test
 public void verifyCookiesHandle(){
     SoftAssert softAssert = new SoftAssert();
     myaccount.getCookiesHandle();
     softAssert.assertAll();
 }

 @AfterMethod
 public void afterMethod(){
     driver.close();
 }
	
}
