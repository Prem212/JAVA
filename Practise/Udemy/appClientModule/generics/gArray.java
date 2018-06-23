package generics;

import java.util.ArrayList;

public class gArray {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("what"
				+ "are"
				+ "you");
		list.add ("tell");
		list.add("me");
		
	    showList(list);
		
	}
	public static void showList (ArrayList<String> list) {
		for (String value: list) {
			System.out.println(list);
		}
		
	}

}
 