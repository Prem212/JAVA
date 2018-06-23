package uDemyTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	@Parameters({"URL"})
	@Test
	public void urlPara(String urlName) {
		System.out.println(urlName);
	}
	
	
	@Test(enabled=false) 	// disable the test cases
	public void ploan() {
		System.out.println("Day2");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeFirst");
	}
	@Test(timeOut=4000)		// time out set for 4 seconds. Wait till those sec.
	public void documents() {
		System.out.println("collect documents");
	}

}
