package recurssion;

public class Recur {

	public static void main(String[] args) {
		
		System.out.println(factorial(3));
			
		}
	public static int factorial(int val) {
		System.out.println(val);
		
		if (val == 1) {
			return val; 	
		}
		
		return factorial(val-1)*val;
		 
		
	}
}

	


