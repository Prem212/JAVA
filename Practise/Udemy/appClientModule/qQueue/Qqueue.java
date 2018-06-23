package qQueue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Qqueue {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayBlockingQueue<>(3);
		
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.offer(4);
		
		
		System.out.println("Element shows head of the queue: "+ q1.element());
		
		q1.remove();
		q1.poll();
		//poll and remove is used to remove but remove throws exception poll returns null
		q1.poll();
		// trying to remove additional element not present.
		try {
			q1.remove();
		} catch (Exception e) {
			System.out.println("you are trying to remove non excisting element");
		}
				
		for(Integer show:q1) {
			System.out.println("Queue value is: "+ show);
		}
		
		

	}

}
