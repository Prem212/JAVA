package caveOfProgrammingTest;

import java.util.Scanner;

public class DdoAndWhile {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		int i=0;
		
		do {
		System.out.println("Enter the number: ");
		i = s.nextInt();
		}
		
		while (i < 10);
		System.out.println("Greater than 10 detected");

	}
	

}
