package aArrayListMethods;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

import edu.emory.mathcs.backport.java.util.Collections;

public class ArrayListMethods<E> {
	
	@Test
	public void meth() {
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(2);
		li.add(5);
		for(int i=0;i<10;i++) {
			li.add(i);
		}
		System.out.println(li);
		
// used to trim a ArrayList instance to the number of elements it contains.		
		li.trimToSize();
		System.out.println(li.clone());
		
		Object a=li.toArray();
		
		ArrayList<Integer> li2= new ArrayList<Integer>();
		li2.add(5);
		li2.add(6);
		li2.add(7);
		
		Collections.sort(li2);
		System.out.println("CollectionSort "+li2);
		
/*//	retains the common elements
		li.retainAll(li2);
		System.out.println(li);
*/		
		
/*		li.addAll(li2);
		System.out.println(li);
*/	
		
// it will remove the common elements in li including the duplicates
		li.removeAll(li2);
		System.out.println(li);
		
/*// this will iterate the list and print one by one. 
		for (Integer run : li) {
			System.out.println(run);
		}*/
		
		
		
	}

}
