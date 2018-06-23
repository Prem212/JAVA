package caveOfProgrammingTest;
import java.util.Scanner;

public class Sswitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("Enter the number: ");
			if (scanner.hasNextInt()) {
				int value = scanner.nextInt();

				switch (value) {
				case (1):
					System.out.println("Got 1");
					break;
				case (66):
					System.out.println("Got 66");
					break;
				default:
					System.out.println("Got Some number");
					break;
				}

			} else {
				scanner.nextLine();
			}

		}
	}
}
