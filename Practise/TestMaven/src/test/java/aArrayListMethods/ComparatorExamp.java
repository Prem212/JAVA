package aArrayListMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import edu.emory.mathcs.backport.java.util.Collections;

public class ComparatorExamp {
	
	@Test
	public void comprtr() {
		List<Integer> s= new ArrayList<Integer>();
		s.add(123);
		s.add(789);
		s.add(110);
		s.add(890);
		
		Comparator<Integer> comparator = new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				if(o1>o2)
					return -1;
				else if(o1<02)
					return 1;
						
				return 0;
			}
			
		};
		
		Collections.sort(s);
		System.out.println(s);
	}

}
