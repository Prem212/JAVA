import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		
				
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		int size= driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		
		
		for(int i=0;i<size;i++) {
			
			driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			String text= driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("name");
			System.out.println(text);
			
			if(text.equals("ctl00$mainContent$chk_IndArm")){
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
				
			}
		}
		
	}

}
