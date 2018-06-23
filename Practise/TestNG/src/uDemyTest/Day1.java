package uDemyTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void demo() {
		System.out.println("Demo");
	}
	
	@Test(groups={"smoke"})
	public void secondTest() {
		System.out.println("SecondTest");
	}
	

	
}
