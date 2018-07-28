package firfoxProfile;

import org.testng.annotations.Test;

public class Practise {

	@Test
	public void just() {
		String s1= "hello";
	    String s2= "hello";
	    String new1= new String(s1);
	    String new2= new String(s2);
	    
	    System.out.println(s1==s2);
	    System.out.println(s1==new1);
	    System.out.println(s1=="he"+"llo");
	    System.out.println(s1=="Hello".toLowerCase());
	}
	
}
