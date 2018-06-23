package iIterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Iiterator {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("rat");

		Iterator<String> ani = animals.listIterator();

		while (ani.hasNext()) {

			String it = ani.next();
			System.out.println(it);
			
			// Used to remove anything from the list if it matches.
			if (it.equals("cat")) {
				ani.remove();

			}

		}
		System.out.println();
		// mordern java interator. Post java 5.
		for (String show : animals) {
			System.out.println(show);

		}

	}
}
