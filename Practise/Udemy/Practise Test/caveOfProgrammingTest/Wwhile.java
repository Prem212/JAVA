package caveOfProgrammingTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wwhile {

	public static void main(String[] args) {
/*		Scanner s = new Scanner(System.in);
		int number = 0;

		while (number != 5) {
			System.out.println("Enter the Number");
			try {
				number = s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter only number");
				break;
			}
			if (number == 5) {
				System.out.println("got it");
			}

		}

		s.close();
*/
		
		/////////////// Optimal way of writting
		int value = 0;
        Scanner scanner = new Scanner(System.in);

        while(value != 5) {
            System.out.println("Enter the number 5: ");
            
// Enters if its an integer
            if(scanner.hasNextInt()) {
                value = scanner.nextInt();
            }
            else {
            	System.out.println("Please enter only number");
                scanner.nextLine();
                
            }
        }

        System.out.println("Got it!");
	}
		

}
