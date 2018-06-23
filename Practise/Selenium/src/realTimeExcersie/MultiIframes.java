package realTimeExcersie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiIframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		int count = driver.findElements(By.tagName("iFrame")).size();
		System.out.println(count);
		
		String subs = ".listbuilder-popup-scale div div .sumome-react-wysiwyg-popup-container .sumome-react-wysiwyg-move-handle div:nth-child(1)";
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(subs)).click();

		/*		for(int i=0; i<count; i++) {
			
			driver.switchTo().frame(i);
			
			int frameCount= driver.findElements(By.cssSelector(subs)).size();
			
			if (frameCount>0) {
				driver.findElement(By.cssSelector(subs)).click();
				break;
			}
			else {
				System.out.println("looping");
			}
		}
		*/

	}
	
/*	public void findingFrameId() {
		WebDriver driver = new ChromeDriver();
		int count = driver.findElement(By.tagName("iFrame")).getSize();
		
	}
*/
}
