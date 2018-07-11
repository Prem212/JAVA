package MavenTest.TestMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dummy {
	
	@Test
	public void chumma() throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Raja Prem Kumar\\Desktop\\JAVA_HP\\TestMaven\\data.properties");
		prop.load(fis);
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.cssSelector("input[type='text'][class='_2zrpKA']")).sendKeys(prop.getProperty("name"));
		
		
		
	}

}
