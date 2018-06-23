package polymorphism;

public class forest {

	public static void main(String[] args) {
		animals ani1 = new animals();
//		System.out.println(ani1.a);
		tree tr1 = new tree();
		
		
//Up casting
		animals ani3= new tree();
		ani3.eating();
	
		
// only method can be overridden. Not variables even though it is common.
		animals ani2= tr1;
		System.out.println(ani2.a);
		System.out.println(tr1.a);
		
//ani2.grow(); wont work because we are trying to use via animal instance(ani2) to access unique tree method.
		tr1.eating();
		ani1.eating(); 
		tr1.grow();

	}

}
