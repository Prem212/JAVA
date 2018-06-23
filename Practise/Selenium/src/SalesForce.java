import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesForce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
/*		System.setProperty("webdriver.gecko.driver", "C:\\Work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	*/	
		driver.get("http://login.salesforce.com");

		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("hi");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
/*		driver.findElement(By.cssSelector("#username")).sendKeys("fire");
		driver.findElement(By.cssSelector("#password")).sendKeys("pass");
		driver.findElement(By.cssSelector("#Login")).click();

	*/	
		driver.findElement(By.xpath("//a[@id='mydomainLink']")).click();
	}

}
