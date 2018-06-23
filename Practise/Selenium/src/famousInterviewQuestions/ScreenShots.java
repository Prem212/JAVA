package famousInterviewQuestions;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
/*Remote Driver
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"),dc);
	*/	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://.ksrtc.in/oprs-web/");
		
		WindowsUtils.killByName("excel.exe");
		

		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\spice\\Pictures\\Saved Pictures\\screenshot.png"));

//Download FileUtils if not working form apache.org common io
	}

}
