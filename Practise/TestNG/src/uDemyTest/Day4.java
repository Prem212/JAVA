package uDemyTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {
	
	
	@Test(dataProvider="getData")
	public void login(String UserName, String Password) {
		System.out.println(UserName);
		System.out.println(Password);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] obj = new Object[3][2];
		
		obj[0][0]= "1stUser";
		obj[0][1]= "1stPass";
		
		obj[1][0]= "2ndUser";
		obj[1][1]= "2ndPass";
		
		obj[2][0]= "3rdUser";
		obj[2][1]= "3rdPass";
		return obj;
	}

}
