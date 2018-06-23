package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Sortedmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> lm= new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		
		show(tree);
	}
	
	public static void show(Map<Integer, String> mp ) {
		mp.put(1,"prem");
		mp.put(3,"sindu");
		mp.put(2, "figgy");
		
	for(Entry<Integer, String> entry: mp.entrySet())	{
		System.out.println("key:"+ entry.getKey()+ " Value is: "+entry.getValue());
	}
		
	}

}

/* HashMap > is implemented as a hash table, and there is no ordering on keys or values. 
TreeMap > is implemented based on red-black tree structure, and it is ordered by the key. 
LinkedHashMap > preserves the insertion order
 Hashtable >is synchronized, in contrast to HashMap
*/