package realTimeExcersie;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
// Maximize the window		
		driver.manage().window().maximize();
		
// Clicking departure date		
		driver.findElement(By.xpath("//input[@mt-id='departDate']")).click();
		
//Selecting month of our choice 		
		
		while(!driver.findElement(By.cssSelector(".filterOptins .dateFilter .ui-datepicker-title")).getText().contains("OCTOBER")) {
			
			driver.findElement(By.cssSelector("[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right'] span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		
// Selecting date // Store it in a list//get the count of the list
		List <WebElement> dates = driver.findElements(By.cssSelector("td[data-handler=\"selectDay\"]"));
		int count = driver.findElements(By.cssSelector("td[data-handler=\"selectDay\"]")).size();
		
//Iterate the list 		
		for(int i=0;i<count;i++) {
			String text = driver.findElements(By.cssSelector("td[data-handler=\"selectDay\"]")).get(i).getText();
			
			if (text.equalsIgnoreCase("23")){
				driver.findElements(By.cssSelector("td[data-handler=\"selectDay\"]")).get(i).click();
				break;
			}
			
			
		}
	}

}
