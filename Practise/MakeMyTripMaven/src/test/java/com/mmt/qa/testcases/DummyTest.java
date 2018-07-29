package com.mmt.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DummyTest {
	@Test
	public void dummy() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#ch_login_icon")).click();
		driver.findElement(By.cssSelector("#ch_login_email")).sendKeys("spiceboytech@gmail.com");
		driver.findElement(By.cssSelector("input[class='ch__pwdLabel'][type='password']")).sendKeys("rajaprem21");
		driver.findElement(By.cssSelector("#ch_login_btn")).click();
		
		Thread.sleep(6000);
		a.moveToElement(driver.findElement(By.cssSelector("#ch_logged-in span:nth-of-type(2).ch__marL5"))).click().build().perform();
		driver.findElement(By.cssSelector("ul.ch__profileOverlayTabs.ch_profilePersonal li:nth-of-type(1) "
			+ ".hdr_account_items#ch_logged-inaccount")).click();
		
		
		
		
	}

}
