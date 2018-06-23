package hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hHashmap {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		System.out.println(hm.isEmpty());
		//Inputting
		hm.put(5, "five");
		hm.put(4, "four");
		hm.put(3, "three");
		hm.put(2, "two");
		hm.put(5, "dummy");
		
		System.out.println(hm.get(5));
		//isEmpty
		System.out.println(hm.isEmpty());
		//Contains key or value
		System.out.println("It is containing key: "+ hm.containsKey(4));
		System.out.println("It is containing value: "+ hm.containsValue("two"));
		
		//Size
		System.out.println("Size is: "+ hm.size());
		
		//This function will order it and give it as array kind
		 Map myvariable = Collections.synchronizedMap(hm);
		 System.out.println(myvariable);
		
		for(Entry<Integer,String> mp: hm.entrySet()) {
			//for(Entry<Integer,String> mp: hm.entrySet()) {
			int key = mp.getKey();
			String value= mp.getValue();
			
			System.out.println("Key: "+ key+ " Value is: "+ value);
		}
	
	}

}

/* HashMap is a data structure that uses a hash function to map identifying values, known as keys, to their 
 * associated values. It contains “key-value” pairs and allows retrieving value by key.
 */