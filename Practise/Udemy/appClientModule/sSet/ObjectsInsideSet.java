package sSet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		return " (ID is : "+ id + "\tName is: "+ name+")";
	}
}

public class ObjectsInsideSet {

	public static void main(String[] args) {
		
		Person per1 = new Person(12, "snake");
		Person per2 = new Person(13, "bird");
		Person per3 = new Person(12, "dog");
		Person per4 = new Person(12, "snake");
		
		Map<Integer, Person> hm = new LinkedHashMap<Integer, Person>();

		
		// Inputting
		hm.put(5, per1);
		hm.put(4, per2);
		hm.put(3, per3);
		
		
		for(int key: hm.keySet()) {
			System.out.println(key +":"+ hm.get(key));
		}
		
		
		//Inserting objects inside set
		Set<Person> s = new TreeSet<Person>();

		s.add(per1);
		s.add(per2);
		s.add(per3);
		
		System.out.println(s);
	}

}
