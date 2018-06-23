package handlingAjaxMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://.ksrtc.in/oprs-web/");
		
		
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("beng");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String name= "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(name);
		System.out.println(text);
		
		int i=0;
		
		while(!text.equalsIgnoreCase("BENGALURU AIRPRT")) {
			i++;
			
			driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(name);
			System.out.println(text);
			
			
			if(i>10) {
				
				break;
				
			}
		}
		if (i>10) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found");
			
		}

	}
	
/*	public void findname() {
		
		while ()
		
		
	}*/

}
