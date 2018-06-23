package Llambda;

interface executable {
	int execute(int a);
	
}

class Runner {
	public void run(executable e) {
		System.out.println("This is Class");
		int Value = e.execute(12);
		System.out.println("The value is: "+Value);
	}

}

public class lLambda {

	public static void main(String[] args) {
		
//	Usual method of writting
		
		Runner runner = new Runner();
		runner.run(new executable() {
			@Override
			public int execute(int a) {
				System.out.println("Main Execute");
				return 1+a;
			}
		});		
		
		System.out.println("++++++++++++++");
		
		runner.run((a)->8+a);
		
	}
	

}
