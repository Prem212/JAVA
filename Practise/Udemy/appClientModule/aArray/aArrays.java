package aArray;

public class aArrays {

	public static void main(String[] args) {
		int [] values= {1,2,3};
		int [] values1 = new int [8];
		int [] value3 = new int [4];
/* ****************** int Arrays **************** */		
		for(int value4:values) {
			System.out.println(value4);
		}
		values[0] =5;
		int i;
		System.out.println(values1[1]);
		for(i=4; i < values1.length;i++) {
			values1[i]=i;
			System.out.println(values1[i]);
		}
		System.out.println(values1[1]);
		double [] prem = { 2.3, 4.5, 6.7};
		System.out.println(prem[1]);
	//	System.out.println(values);

		
/* ****************** String Arrays **************** */	
		
		String[] words = {"apple", "goat"};
		for(String word:words) {
			System.out.println(word +"\t"+ "is");
			
		}
		
		

	}

}
