package famousInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOptions {
	
	public void chromeOptionstry() {
		
		org.openqa.selenium.chrome.ChromeOptions c = new org.openqa.selenium.chrome.ChromeOptions();
		c.addArguments("--headless");		// headless
		c.addArguments("--disable-gpu");		// headless
		WebDriver driver = new ChromeDriver(c);
		
		c.addArguments("disable-infobars");		// disabling the info "'Chrome is being controlled by automated test software'
		c.addArguments("user-data--dir=C:/Users/username/AppData/Local/Google/Chrome/User Data");	// using chrome profile

	}

}
