package caveOfProgrammingTest;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class InteractiveProg {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = s.nextInt();
		
		if (no < 10) {
			System.out.println("The no is too small");
		}
		else if (no >= 10){
			System.out.println(" The number is too large");
		}
		

	}

}
