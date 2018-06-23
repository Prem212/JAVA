import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nuron.co.in");
		
		driver.findElement(By.xpath("//*[@id=\'nav-menu-item-5775\']")).click();
		driver.findElement(By.xpath("//span[@class='item_text'][contains(text(),'About us')]")).click();
		
//		driver.findElement(By.xpath("//a[@class=' current ']/span/span/span[1]")).click();

// 		driver.findElement(By.xpath("//div[@class='gb_qe gb_R gb_Pg gb_Fg']/div[3]/a")).click();
	}

}
