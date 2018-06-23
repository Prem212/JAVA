package fileReadtry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) {
		File file = new File("Java1.txt");
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write("Prem");
			br.newLine();
			br.write("Hi");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	

}
