package com.mmt.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.base.TestBase;
import com.mmt.qa.page.HomePage;
import com.mmt.qa.page.LoginPage;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void MyAccountsClickTest() {
		homePage.MouseHoverProfile();
		String title =homePage.VerifyAccountsPageTitle();
		Assert.assertEquals(title,"Customer Support - MakeMyTrip - India's No.1 Travel Company");
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
