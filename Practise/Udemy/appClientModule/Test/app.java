// Scanner, do and while loops.
package Test;

import java.util.Scanner;

import anonymous.aAnonymous;

public class app {
	// created for used as inheritance
	public void donald() {
		System.out.println("this is donald");
	}

	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("Enter Number = ");
		 * Double n = scan.nextDouble(); System.out.println(n);
		 */

		Scanner s = new Scanner(System.in);
		int value = 0;
		do {
			System.out.println("Enter the new number");
			value = s.nextInt();
		} while (value == 5);
		System.out.println(" Your entered number is: " + value);
	}
}
