package naturalOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


class person {
	private String name;
	
	public person (String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	
}

public class NaturalOrder {

	public static void main(String[] args) {
		
				
		List<person> li = new ArrayList<person>();
		SortedSet<person> se = new TreeSet<person>();
		
		addElements(li);
		addElements(se);
		
		//Collections.sort(li);
		
		showElements(li);
		System.out.println();
		showElements(se);
	
	}
	
	public static void addElements(Collection<person> col) {
		col.add(new person("prem"));
		col.add(new person("figgy"));
		col.add(new person("sindu"));
		col.add(new person("amma"));
		
	}
	
	public static void showElements(Collection<person> col) {
		for(person show:col) {
			System.out.println(show);
		}
	}

}
