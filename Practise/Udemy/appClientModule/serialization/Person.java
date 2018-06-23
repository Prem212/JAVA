package serialization;

import java.io.Serializable;

public class Person implements Serializable {

		private String name;
		private int id;
				
	public Person(String name,int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return "Name is: " +name+ "\nID is: "+ id;
	}

}

