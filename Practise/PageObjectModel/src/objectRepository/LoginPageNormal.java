package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageNormal {
	
	WebDriver driver;
	
	public LoginPageNormal(WebDriver driver) {
		this.driver=driver;
		
	}
	
	By username= By.cssSelector("#login1");
	By password= By.name("passwd");
	By Submit = By.name("proceed");
	
	public WebElement username() {		
		return driver.findElement(username);		
	}
	
	public WebElement password() {
		return driver.findElement(password);		
	}
	
	public WebElement go() {
		return driver.findElement(Submit);
	}

}
