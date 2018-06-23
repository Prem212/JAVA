package aArray;

import java.util.Scanner;

public class multiArrays {

	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner ob= new Scanner(System.in);
		String value= ob.nextLine();
		String[][] words = new String[2][3];
		words[1][2] = "apple";
		int k=0;
//		System.out.println(words[1][2]);

		String[][] num = { 
				{ "apple", "dog" }, 
				{ "Prem", "sindu", "sac"}, 
				{"Prem", "dog"}
				
		};
		
// Find out the number of occurence
		for(int row =0; row < num.length; row++) {
			for(int col=0; col < num[row].length;  col++) {
				System.out.println(value + "\t"+ num[row][col]);
				if (value == num[row][col] ) {
					k=k+1;
				}
				
			}
			
		}
		System.out.println("It is occuring: " + k + " times");
		
//		System.out.println(num[0][1]);
		for (int i = 0; i < (num.length); i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+"\t");
			}
System.out.println();
		}
	}

}
