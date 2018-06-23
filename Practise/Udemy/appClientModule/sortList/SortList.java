package sortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stringlenghtsort implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();

		if (l1 > l2) {
			return 1;
		} else if (l1 < l2) {
			return -1;
		}
		return 0;

	}
}
class ReverseAlphaSort implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);

	}
}

public class SortList {

	
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("prem");
		al.add("figgggggy");
		al.add("sindu");
		al.add("am");
		
		/////////////// Alphabetical lengthwise sorting//////////////////////////
//		Collections.sort(al,new Stringlenghtsort());

		/////////////// Reverse alphabetical sorting //////////////////////////
		Collections.sort(al,new ReverseAlphaSort());
		
		for (String names: al) {
			System.out.println(names);
		}
		
		List<Integer> in = new ArrayList<Integer>();
		
		in.add(12);
		in.add(2);
		in.add(23);
		in.add(42);
		
//		Normal sorting	
//		Collections.sort(in);

//		reverse integer sorting		
		Collections.sort(in, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				return -i1.compareTo(i2);
			}
			
		});
		
		for (Integer intsort: in) {
			System.out.println(intsort);
		}
		
		
		
}

}
