package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	WebDriver driver;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#login1")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name= "proceed")
	WebElement Submit;
	

	public WebElement username() {		
		return username;		
	}
	
	public WebElement password() {
		return password;		
	}
	
	public WebElement go() {
		return Submit;
	}

}
