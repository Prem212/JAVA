package readingfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class rReadingfiles {

	public static void main(String[] args) throws FileNotFoundException {
		// String filename = "C:\\Users\\Raja Prem Kumar\\Desktop\\Documents\\Java.txt";
		String filename = "Java.txt";
		File text = new File(filename);
		Scanner in = new Scanner(text);
		int value = in.nextInt();
	    System.out.println("read value:"+ value);

		int count = 0;
		in.nextLine();

			while (in.hasNextLine()) {
				System.out.println(count + ":" + in.nextLine());
				count++;
			}
		}

	}


