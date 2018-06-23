import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");

// Static Drop down selection
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("AED");
		s.selectByIndex(3);
		
		
// Dynamic Dropdown
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='IXM']")).click();

	// This will search Pune in the first set table which is closed because it is searching from left to right	in html code
//		driver.findElement(By.xpath("//a[@value='PNQ']")).click();		
		driver.findElement(By.xpath("(//a[contains(text(),'PNQ')])[2]")).click();

	}

}
