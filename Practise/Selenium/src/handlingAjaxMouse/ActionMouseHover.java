/**
 * 
 */
package handlingAjaxMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseHover {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://amazon.com");
			Thread.sleep(5000);
// Creating Action Class
			Actions a=new Actions(driver);
			
// Move to mouse to particular element.
// we can also do it via link text.
//			a.moveToElement(driver.findElement(By.linkText("Try Prime"))).build().perform();
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"))).build().perform();
			

			Thread.sleep(5000);
// Building composite action
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();

// Right click			
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("kindle").contextClick().build().perform();

		
		
		}

}
