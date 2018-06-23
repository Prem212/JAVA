package sSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sset {

	public static void main(String[] args) {

		// Hash does not retain order
		// Set<String> s = new HashSet<String>();

		// Retains the insertion order
		// Set<String> s = new LinkedHashSet<>();

		// it will order the values
		Set<String> s = new TreeSet<>();

		s.add("Prem");
		s.add("Figgy");
		s.add("Sindu");
		s.add("Amma");

		System.out.println(s.contains("Amma"));
		System.out.println(s.size());
		System.out.println(s.equals("Sindu"));
		// System.out.println(s.remove("Prem"));
		// System.out.println(s.iterator());

		System.out.println(s);

		Set<String> s1 = new HashSet<>();

		s1.add("Prem");
		s1.add("Figgy");
		s1.add("machi");
		s1.add("appa");
		
		// Intersection//////////////////////
		
		Set<String> intersec = new TreeSet<>(s);
		intersec.retainAll(s1);
		System.out.println(intersec);
		
		//Difference///////////////////////////
		
		Set<String> diff = new TreeSet<>(s);
		diff.removeAll(s1);
		System.out.println(diff);

	}

}
