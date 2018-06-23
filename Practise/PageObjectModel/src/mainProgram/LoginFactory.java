package mainProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.LoginPageFactory;

public class LoginFactory {

	public static void main(String[] args) {
//	public void LoginTry() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
	
	//Instead of hard coding of locating the elements we are using Page object mode where we will  stuff all the objects
	//of a particular page and use them here.
	/*	driver.findElement(By.cssSelector("#login1")).sendKeys("hello");
		driver.findElement(By.name("passwd")).sendKeys("hi");
		driver.findElement(By.name("proceed")).click();*/
		
		LoginPageFactory lpf = new LoginPageFactory(driver);
		
		lpf.username().sendKeys("hello");
		lpf.password().sendKeys("pass");
		lpf.go().click();
	
	
	
}
	}
		
