package famousInterviewQuestions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HttpCerti {

	public static void main(String[] args) {
		
//it is class to customize chrome profile to  ur chrome browser.
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();									// one way of accepting
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true); // another way of accepting
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
//To set you local browser		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);												//Merging the set capabilities to ur local
	
		//	c.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true); this line is also possible from options

		
/*	// Code to set profile for firefox and pass it on to webdriver.	
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("", true);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(options);
	*/

	}

}
