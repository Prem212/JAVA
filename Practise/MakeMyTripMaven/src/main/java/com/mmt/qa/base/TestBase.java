package com.mmt.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmt.qa.utilites.TestUtil;
import com.mmt.qa.utilites.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	public static EventFiringWebDriver eFdriver;
	public static WebEventListener elistener;
	
	public TestBase() {
		
		try {
		prop =new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Raja Prem Kumar\\Desktop\\JAVA_HP\\MakeMyTripMaven\\config.properties");
		prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Work\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		eFdriver = new EventFiringWebDriver(driver);
		elistener = new WebEventListener();
		eFdriver.register(elistener);
		driver=eFdriver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicitly_Wait, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		
		driver.get(prop.getProperty("url"));
		
	}

}
