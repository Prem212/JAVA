package randomExcecise;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

//************************************************NOT COMPLETED***************************************************


public class RepeatNoinArray {

	public static void main(String[] args) {
		int [] a= {4,5,5,5,4,6,6,9,4};
		Set<Integer> s = new LinkedHashSet<>();
		s.add(22);
		s.add(21);
		Set <Integer> s2 = new LinkedHashSet<>();
		s2.add(1);
		s2.add(2);
		s2.add(3);
		s2.add(4);
		s2.add(5);
/*		for(Integer ad:a) {
			s.add(ad);
		}
		
		for(Integer show: s) {
			System.out.println(show);
		}*/
		//Collections.addAll(s, 1,2,3);
		s.addAll(s2);
		System.out.println(s);
			
	}

}
