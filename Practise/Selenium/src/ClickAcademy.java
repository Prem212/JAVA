import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAcademy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/interview.php");
		
		//driver.findElement(By.xpath("//a[@class='active'][contains(text(),'Interview Guide')]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]")).click();
	}

}
