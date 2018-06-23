package fileReadtry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilereadTry {

	public static void main(String[] args) {
		File file = new File("Java1.txt");
//		We can declare like the below also
//		FileReader fr = new FileReader(file);
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while ((line= br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
