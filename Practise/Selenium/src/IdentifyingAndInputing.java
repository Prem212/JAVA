import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class IdentifyingAndInputing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("hi");
// locating via xpath		
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("1234");
		driver.findElement(By.cssSelector(cssSelector))
		//driver.findElement(By.linkText("Forgotten account?")).click();
// locating via css path.
		driver.findElement(By.xpath("//*[@id=\'u_0_3\']")).click();
		
		//driver.close();

	}

}
