package famousInterviewQuestions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HttpCerti {

	public static void main(String[] args) {
		
//it is class to customize chrome profile to  ur chrome browser.
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();									// one way of accepting
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true); // another way of accepting
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
//To set you local browser		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);												//Merging the set capabilities to ur local
	
		//	c.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true); this line is also possible from options
	
		
	

	}

}
