package mainProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.LoginPageNormal;

public class Login {

	@Test
	public void LoginTry() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
	
	//Instead of hard coding of locating the elements we are using Page object mode where we will  stuff all the objects
	//of a particular page and use them here.
	/*	driver.findElement(By.cssSelector("#login1")).sendKeys("hello");
		driver.findElement(By.name("passwd")).sendKeys("hi");
		driver.findElement(By.name("proceed")).click();*/
		
		LoginPageNormal lp = new LoginPageNormal(driver);
		
		lp.username().sendKeys("hello");
		lp.password().sendKeys("pass");
		lp.go().click();
	
	
	
}
		
		

	

}
