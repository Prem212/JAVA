package com.info.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(css="input[type='text'][class='_2zrpKA']")
		WebElement username;
		
		@FindBy(xpath="//input[@class='_2zrpKA _3v41xv']")
		WebElement password;
		
		@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
		WebElement submit;
		
		
		
		public WebElement userName() {
			return username;
		}
		
		public WebElement password() {
			return password;
		}
		
		public WebElement submit() {
			return submit;
		}
	
	
	

}
