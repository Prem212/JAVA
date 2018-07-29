package com.mmt.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.qa.base.TestBase;

public class HomePage extends TestBase {
	Actions a= new Actions(driver);
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="#ch_logged-in span:nth-of-type(2).ch__marL5")
	WebElement MoveMousetoProfile;
	
	@FindBy(css="ul.ch__profileOverlayTabs.ch_profilePersonal li:nth-of-type(1) "
			+ ".hdr_account_items#ch_logged-inaccount")
	WebElement Account;
	
	//Actions
	public String VerifyAccountsPageTitle() {
		return driver.getTitle();
	}
	
	public MyAccounts MouseHoverProfile() {
		a.moveToElement(MoveMousetoProfile).click().build().perform();
		Account.click();
		return new MyAccounts();
	}
}
