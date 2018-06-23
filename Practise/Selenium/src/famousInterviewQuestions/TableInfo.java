package famousInterviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableInfo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://espncricinfo.com/series/18707/scorecard/1145984/afghanistan-vs-bangladesh-3rd-t20i-bangladesh-tour-of-india-2018/");
//		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
//		Thread.sleep(5000);

//Reduce the scope of the table only to the first innigs. 
		WebElement table=driver.findElement(By.xpath("//ul[@class='css-accordion']//div[@id='gp-inning-00']"));
		
		System.out.println(table.getSize());
		
		int rowCount=table.findElements(By.cssSelector(".flex-row")).size();
		int runCount = table.findElements(By.cssSelector("div[class='flex-row'] div:nth-child(3)")).size();
		System.out.println(runCount);
		
		int sum=0;
		int intrun=0;
		for(int i=1;i < rowCount-2;i++) {
			String runs=table.findElements(By.cssSelector("div[class='flex-row'] div:nth-child(3)")).get(i).getText();
			System.out.println(runs);
			if(!runs.equalsIgnoreCase("")) {
				intrun=Integer.parseInt(runs);
				sum=sum+intrun;							
			}
//						
			
		}
		System.out.println(sum+17);
		
		
		
	}

}
 