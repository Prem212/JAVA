package randomPrograms;

public class StringReverse {

	public static void main(String[] args) {

		String S = "Prem ";

		int i;
		
		System.out.println(S.substring(1,3));
		System.out.println(S.trim());
		System.out.println(S.contains("re"));
		System.out.println("Ignore case= "+S.equalsIgnoreCase("prem "));
		System.out.println("CharacterArray: "+S.toCharArray());
		System.out.println(S.toLowerCase());
		

		for (i = S.length() - 1; i >= 0; i--) {
			char rev = S.charAt(i);
			
			System.out.print(rev);

		}

		/*  Using in-build function
		 * StringBuffer S= new StringBuffer("Prem"); 
		 * System.out.println(S.reverse());
		 */

		/*
		 * Normal string traverse 
		 * for (i=0; i<S.length();i++) { char rev = S.charAt(i);
		 * System.out.print(rev);
		 
		 * }
		 */

	}

}
