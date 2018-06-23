package Test;

public class loops {
	public static void main(String[] args) {
		int i = 0;
		int k = 5;
// While loop	
		while (i < 2) {
		 System.out.println("Run it");
		 i = i + 1;
		 }
//For and if loop
		for (int j = 0; j < 7; j++) {
			System.out.printf("This is for loop: %d\n" , j);
			if (k < 10) {
				System.out.println("Testing if loop");
				k++;
			}
			else {
				System.out.println("came out of loop");
			}
		}
		
	}
}

