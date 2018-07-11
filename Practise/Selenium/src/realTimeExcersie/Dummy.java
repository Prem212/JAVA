package realTimeExcersie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.findElement(By.cssSelector("input[type='text'][class='_2zrpKA']")).sendKeys("rajaprem");
	}

}
