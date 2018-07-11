package firfoxProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profiling {
	
	public void fire() {
	
// to load all the fireFox profiles		
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile fp= p.getProfile("Default"); // pass the profile u want to pass
		
	System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
	WebDriver driver = new FirefoxDriver();

}
}