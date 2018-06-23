import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		
// Implicit Wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

// Explicit Wait
		WebDriverWait d = new WebDriverWait(driver, 10);
		
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
//		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isDisplayed());
		
// Explicit Wait example		
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		
//Thread.Sleep example.
		Thread.sleep(10000);
	}

}
