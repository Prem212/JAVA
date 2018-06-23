package framWorkDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAndInitializing {
	
	public static WebDriver driver;

	public static void Login() throws IOException {
		
// Setting up properties class for accessing files outside.		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\spice\\Documents\\GitHub\\JAVA\\Practise\\Selenium\\src\\framWorkDataDriven\\DataDriven.properties");
		prop.load(file);
		
		System.out.println(prop.getProperty("username"));

// Making sure we are not hard coding of initializing the URL		
		if (prop.getProperty("browser").contains("chromedriver")) {
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox")){
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		

	}

}
