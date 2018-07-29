package com.mmt.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(css="#ch_login_icon")
	WebElement loginicon;
	
	@FindBy(css="#ch_login_email")
	WebElement emailid;
	
	@FindBy(css="input[class='ch__pwdLabel'][type='password']")
	WebElement password;
	
	@FindBy(css="#ch_login_btn")
	WebElement loginButton;
	
	@FindBy(css=".mmt_header_logo")
	WebElement mmtLogo;
	
	//initializing the objects
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	
	public String validateLoginPage() {
		return driver.getTitle();
	}
	
	public boolean validateMmtLogo() {
		return mmtLogo.isDisplayed();
	}
	
	public HomePage login(String em, String pw ) {
		loginicon.click();
		emailid.sendKeys(em);
		password.sendKeys(pw);
		loginButton.click();
		return new HomePage();	// home page class object
	}
	
	

}
