package Test;

import java.util.Scanner;

public class numofoccurence {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		int[] oc = { 1, 2, 3,4,2,2,2,3, 4, 5, 3,2};
		int j = 0;

		for (int i = 0; i < oc.length; i++) {

			if (value == oc[i]) {
				j = j + 1;
			}
		}
		System.out.println("It is occuring: " + j + " times");
	}

}

