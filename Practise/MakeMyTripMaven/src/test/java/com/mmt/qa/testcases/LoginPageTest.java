package com.mmt.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.mmt.qa.base.TestBase;
import com.mmt.qa.page.HomePage;
import com.mmt.qa.page.LoginPage;
import com.mmt.qa.utilites.TestUtil;


public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testUtil;
	
	String sheetName="credentials";
	
	// Initializing log4j
	Logger log= Logger.getLogger(LoginPageTest.class);
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		log.info("***********Initalization started************");
		initialization();
		loginpage= new LoginPage();		
	}
	
	
	@Test(priority=1)
	public void validateLoginpageTest() {
		String title=loginpage.validateLoginPage();
		Assert.assertEquals(title, "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
	}
	
	@Test(priority=2,enabled=false)
	public void validateMmtLogoTest() {
		boolean flag=loginpage.validateMmtLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3,enabled=false)
	public void loginTest() {
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@DataProvider
	public Object [][] loginCredentials() {
		Object [][] obj=TestUtil.getTestData(sheetName);
		return obj;
		
	}
	
	@Test(priority=4,dataProvider="loginCredentials",enabled=false)
	public void differenetLoginCredentialsTest(String Usr, String pwd) {
		loginpage.login(Usr, pwd);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	

}
