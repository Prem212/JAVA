package Test;

import java.util.Scanner;

public class sSwitch {
	
/*public sSwitch() {
	System.out.println("1");
	
}*/
public sSwitch(String s) {

	System.out.println("2"+s);
	
}
public void m() {
	System.out.println("method");
	System.out.println("Hi.\t what.\nare");
		
}
	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Pleas enter something");
		*/
		/*String value = s.next()*/;
		sSwitch obj = new sSwitch("viaan");
		obj.m();
		//sSwitch obj1 = new sSwitch();
		
		
		/*switch (value) {
		case "what":
			System.out.println("Started");
			break;
		case "how":
			System.out.println("ended");
			break;

		default:
			System.out.println("this is default");
			}
*/
		

	}

}
