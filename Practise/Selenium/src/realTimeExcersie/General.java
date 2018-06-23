package realTimeExcersie;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class General {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nuron.co.in/nuroncube/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
// COunt the links
		System.out.println(driver.findElements(By.tagName("a")).size());
		
// count of links in footer section
		WebElement footerDriver= driver.findElement(By.xpath("//div[@class='qodef-footer-inner clearfix']"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

// Click all the link in new tab and get the page title		
		int size = footerDriver.findElements(By.tagName("a")).size();

		for (int i = 1; i < size; i++) {
			String clicklink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerDriver.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
		}

		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
