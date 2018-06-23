package realTimeExcersie;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=167.0_1");
		driver.manage().window().maximize();
		
// Finding the bootstrap drop down. In traditional dropdown we have Select class.
// But in bootstrp dropdown we dont have Select class. Use normal path.
		driver.findElement(By.cssSelector("span[class='selected-label pull-left']")).click();
		
		List<WebElement> drop = driver.findElements(By.xpath("//ul[@class='dropdown-menu inner']//li"));
		System.out.println(drop.size());
		
		
		for(int i=0; i<drop.size();i++) {

// This supposed to print all the values but because of the if condition it prints only till the condition satisfied.			
			System.out.println(driver.findElements(By.xpath("//ul[@class='dropdown-menu inner']//li")).get(i).getText());
			
			
			if (drop.get(i).getText().contains("Scripting") && (!drop.get(i).isSelected())) {
				drop.get(i).click();
				break;
			}
		}

	}

}
