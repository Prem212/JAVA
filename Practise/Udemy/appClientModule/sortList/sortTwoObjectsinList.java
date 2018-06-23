package sortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id=id;
		this.name =  name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id + ":" + name;
	}
}


public class sortTwoObjectsinList {
	
	

	public static void main(String[] args) {
		
		
		
		List<Person> al = new ArrayList<Person>();
		al.add(new Person(1,"prem"));
		al.add(new Person(3,"three"));
		al.add(new Person(5,"five"));
		al.add(new Person(2,"two"));
		
		Collections.sort(al,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getId() > p2.getId()) {
					return 1;
				}
				else if (p1.getId() < p2.getId()) {
					return -1;
				}
				 
				return 0;
			}
		});

		for (Person value: al) {
			System.out.println(value);
		}
		
		
		System.out.println("\n");
		
//// Sorted in terms of name
		
		Collections.sort(al,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});

		for (Person value: al) {
			System.out.println(value);
		}
		
		

	}

}
