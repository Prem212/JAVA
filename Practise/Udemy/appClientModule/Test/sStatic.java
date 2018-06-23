package Test;

class tata {
	public static int count=0;
	String name;
	public static String words;
	
	public tata() {
		count++;
	System.out.println(words);
	}
}

public class sStatic {

	public static void main(String[] args) {
		tata.words="gym";
		tata t1= new tata();
		tata t2 = new tata();
		System.out.println(tata.count);
		
		
		
	

	}

}
