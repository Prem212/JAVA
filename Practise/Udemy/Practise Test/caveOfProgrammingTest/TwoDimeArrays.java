package caveOfProgrammingTest;

public class TwoDimeArrays {

	public static void main(String[] args) {
		
		String [][] person = {
				{"Prem","Kumar","Figgy"},
				{"Sindu","Amma","Machi"}
			
		};
		
		//System.out.println(person[1][2]);
		for(int row =0; row < person.length; row++) {
			for(int col =0; col < person[row].length;col++) {
				System.out.println(person[row][col]);
				System.out.print("");
			}
			System.out.println();
		}

	}

}
