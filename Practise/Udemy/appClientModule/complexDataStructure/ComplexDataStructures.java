package complexDataStructure;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {

	public static String[] vehicles = { "Ambulance", "Helicopter", "Boat" };

	public static String[][] drivers = { 
			{ "Prem", "Jeykumar", "Premnath" },
			{ "Sindhu", "Figgy", "Viaan" },
			{ "Amma", "ushaakka", "Sivesh" },

	};

	public static void main(String[] args) {
		Map<String, Set<String>> mp = new LinkedHashMap<>();
		int i;

		for (i = 0; i < vehicles.length; i++) {
			String trans = vehicles[i];
			// System.out.println(trans);
			String[] driverlist = drivers[i];

			Set<String> driverset = new LinkedHashSet<String>();

			for (String dr : driverlist) {
				driverset.add(dr);
				// System.out.println(dr);
			}

			mp.put(trans, driverset);

		}
		
		
		Set<String> ge = mp.get("Helicopter");

		// this will display as a set.
		// System.out.println(ge);

		// this will display one my one
		for (String show : ge) {
			System.out.println(show);
		}

		// Iterate the whole map
		for (String vehicles : mp.keySet()) {
			// System.out.println(vehicles);
			Set<String> gett = mp.get(vehicles);

			// System.out.println(vehicles+ "\n" + "\t"+gett );
			System.out.println();
			System.out.println(vehicles + ":");
			
			gett.forEach(show -> System.out.println("\t" + show));

/*			for (String show : gett) {
				System.out.println("\t" + show);
			}*/

		}

	}

}
