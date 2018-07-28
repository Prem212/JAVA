import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserInvoke {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		
		ChromeOptions c = new ChromeOptions();
		c.addArguments("disable-infobars");			// disabling the info "'Chrome is being controlled by automated test software'
		c.addArguments("user-data--dir=C://Users//username//AppData//Local//Google//Chrome//User Data//Profile 1");	// using chrome profile
		
		
		WebDriver driver = new ChromeDriver(c);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		//driver.close();

/*		System.setProperty("webdriver.gecko.driver","C:\\Work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	*/	
/*		System.setProperty("webdriver.ie.driver","C:\\Work\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		*/
	}

}
