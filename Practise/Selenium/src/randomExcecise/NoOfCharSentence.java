package randomExcecise;

public class NoOfCharSentence {

	public static void main(String[] args) {
		String word = "How is Sindu";
		
		char [] Ar= word.toCharArray();
		int j=0;
		
		
		for (int i=0;i<Ar.length;i++) {
			String output = "";
			
			while(i<Ar.length && Ar[i] != ' ') {
				
				 output = output + Ar[i];
				 i++;
			}
			if(output.length() > 0)
				System.out.println(output+ " --> "+ output.length());		
		}
		
	}

}
