package handlingAjaxMouse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nuron.co.in/nuroncube/");
		
		driver.findElement(By.xpath("//a[@class='qodef-btn qodef-btn-medium qodef-btn-solid qodef-btn-hover-animation']")).click();
		
// Logic to switch to child window		

		Set<String> count= driver.getWindowHandles(); // method which gives all id of the windows opened
		Iterator<String> it = count.iterator();
		String parentid= it.next();
		String childid=it.next();
		driver.switchTo().window(childid);		//
		
		System.out.println(driver.getTitle());

// Coming back to parent window.		
		driver.switchTo().window(parentid);
		
		

	}

}
