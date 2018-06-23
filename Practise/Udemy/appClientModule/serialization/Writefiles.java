package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writefiles {

	public static void main(String[] args) {
		Person per = new Person("Prem",1);
		Person per1 = new Person("Sindu",2);
		
		System.out.println(per1);
		System.out.println(per);
		
		try(FileOutputStream fo = new FileOutputStream("file.bin")){
			
			ObjectOutputStream ou = new ObjectOutputStream(fo);
			ou.writeObject(per);
			ou.writeObject(per1);
			ou.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
