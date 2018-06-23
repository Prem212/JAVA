package realTimeExcersie;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDropDownSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='lst-ib']")).click();
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("carrot");
		
		Thread.sleep(6000);
		
//Take all the suggestion after typing. Since every suggestion is falling under common path. Find that put it in list.		
		List<WebElement> list= driver.findElements(By.cssSelector("ul[class='sbsb_b'] li div [class='sbqs_c']"));
						// or  //
//		List<WebElement> list= driver.findElements(By.ul[@role='listbox']//li//descendant::div[@class='sbqs_c']

		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("carrot halwa")) {
				list.get(i).click();
				break;
			}
		}
		

	}

}
