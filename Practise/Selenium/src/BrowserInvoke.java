import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInvoke {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
