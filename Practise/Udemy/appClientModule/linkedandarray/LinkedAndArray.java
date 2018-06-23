package linkedandarray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedAndArray {

	public static void main(String[] args) {
		
// Array list adds items at the end faster. If you are adding items from the start then the rest of the items have to
// be moved or aligned.
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
		LinkedList<Integer> LL = new LinkedList<Integer>();
		show("LinkedList", LL);
		show("ArrayList", AL);


		
		
//Linked list has each element which has reference to the next element. [0]-> [1]->[2]->. SO traversing takes longer.
//BUt adding in the middle is just pointing to the previous reference.
	}
	
	public static void show(String type , List<Integer> list) {
		
		for(int i=0;i<1E5;i++) {
			//list is the place if AL or LL is passed from other method.
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
//		for(int i=0;i<1E5;i++) {
//			//list is the place if AL or LL is passed from other method.
//			list.add(i);
//		}
		
		// Adding items in middle and start Linked list takes less time.
		for(int i=0;i<1E5;i++) {
			//list is the place if AL or LL is passed from other method.
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time Taken: "+ (start-end+ " ms"+ " for "+ type));
	}

}
