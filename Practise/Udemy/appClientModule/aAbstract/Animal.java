package aAbstract;

public class Animal extends Forest {
	int a=0;

	@Override
	public void living() {
		System.out.println("Animal is living");
		
	}

	@Override
	public int show() {
//		System.out.println(a);
		return a;
	}

}
