package uDemyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void webLogin() {
		System.out.println("weblogin");
		Assert.assertTrue(false);			//If the value is true it will convert to false
	}
	
	@Test(groups= {"smoke"})
	public void mobileLogin() {
		System.out.println("Mobile");
	}
	
	@Test(dependsOnMethods= {"webLogin"})
	public void transfer() {
		System.out.println("Transfer");
	}

}
