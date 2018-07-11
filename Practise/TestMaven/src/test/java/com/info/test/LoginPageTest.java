package com.info.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.info.pages.HomePage;
import com.info.pages.LoginPage;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class LoginPageTest {
	
	
	
	@Test
	public void login() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Raja Prem Kumar\\Desktop\\JAVA_HP\\TestMaven\\data.properties");
		prop.load(fis);
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait expWait = new WebDriverWait(driver, 5);
		Wait<WebDriver> fw= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(2000))
				.pollingEvery(Duration.ofMillis(1000))
				.ignoring(ArithmeticException.class);
		
		
		
		LoginPage log = new LoginPage(driver);
		
		log.userName().sendKeys(prop.getProperty("name"));
		log.password().sendKeys(prop.getProperty("pass"));
		log.submit().click();
		
//		expWait.until(ExpectedConditions.elementIfVisible(log.submit().click()));
// Home page actions below. Later change it to HomePage test
		
		HomePage hmTest = new HomePage(driver);
		Actions action = new Actions(driver);
		WebElement profile = driver.findElement(By.cssSelector("._2cyQi_"));
	
		// Hovering to profile//
		action.moveToElement(profile).perform();
		WebElement orders = driver.findElement(By.cssSelector("div.nMZVnr li:nth-child(2)"));
		// Clicking on orders//
		System.out.println(orders.getTagName());
		action.click(orders).perform();
		
		

	}
	
}
