package handlingAjaxMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com");		
		
//Navigating to draggable		
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();

//Finding iframes
		
//		driver.switchTo().frame(0);		//If you know how many frames are there in the page. If its only one then 0.
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

//Creating Action class		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		a.dragAndDrop(source, target).build().perform();
				//or//
//		a.clickAndHold(source).moveToElement(target).build().perform();
		

//Switching back to default content page.
		driver.switchTo().defaultContent();

	}

}
