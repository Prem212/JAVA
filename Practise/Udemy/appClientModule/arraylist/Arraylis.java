package arraylist;

import java.util.ArrayList;

public class Arraylis {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(3);
		li.add(20);
		li.add(30);

		System.out.println(li.get(0));

		// Method 1 to print the array list
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		// Removing the 1st index. But the rest of the values get left aligned which in turn fills the 1st index.
		// This method is very slow because if 1st value is removed then alignment takes place.
		System.out.println();
		li.remove(0);
		System.out.println("Index 0 is: " + li.get(0) + " Because it gets left alligned");
		
		// very fast when removing from last.
		li.remove(li.size() - 1);

		// Method 2 to print the array list
		System.out.println();
		for (Integer value : li) {
			System.out.println(value);
		}

	}

}
