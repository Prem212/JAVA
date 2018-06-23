package realTimeExcersie;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://nuron.co.in");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		
// All the links are refereed by tagname as "a", "img".	Put it in a ArrayList.	
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println(linkList.size());
		
		List<WebElement> activeLinks= new ArrayList<WebElement>();
		
		for(int i=0; i< linkList.size(); i++) {
			 if((linkList.get(i).getAttribute("href"))!= null && (!linkList.get(i).getAttribute("href").contains("javascript"))) {
				 activeLinks.add(linkList.get(i));
			 }

//The SSL certificate isn't trusted by Java. The certificate may be self-signed, or it may be signed by a 
// CA (Certificate Authority) whose root certificate is not in the Java certificate store.			 
			 TrustManager[] trustAllCerts = new TrustManager[]{
					 new X509TrustManager() {
					     public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					         return null;
					     }
					     public void checkClientTrusted(
					         java.security.cert.X509Certificate[] certs, String authType) {
					     }
					     public void checkServerTrusted(
					         java.security.cert.X509Certificate[] certs, String authType) {
					     }
					 }};

					    try {
					     SSLContext sc = SSLContext.getInstance("SSL");
					     sc.init(null, trustAllCerts, new java.security.SecureRandom());
					     HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
					     } catch (Exception e) {
					     }
					    
// Save the active link is a URL object and type cast with A URLConnection with support for HTTP-specific features. 
			 for(int j=0;j<activeLinks.size();j++) {
				HttpURLConnection connection= (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
				connection.connect();
				String response= connection.getResponseMessage();
				connection.disconnect();
				
				if (response =="OK") {
					System.out.println(activeLinks.get(j).getAttribute("href") +"-->"+response);
				}
				
			 }
		}
		

	}

}
