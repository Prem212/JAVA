package Test;
class students{
	String name;
	int roll;
	String name2;
	
	void calculate() {
		System.out.println("The name is: "+ name);
	}
	void jump(int height) {
		System.out.println(height);
	}
/* ****************** getters with return **************** */
	int getName() {
		return roll;
	}
/* ****************** Passing two arguments to function **************** */
	
	void words(String text, double number) {
		System.out.println(text + number);
	}
/* ****************** setters with return **************** */
	String setName(String newName) {
		String honda = newName;
		return honda;
	}

	void tryThis(String name, String name2) {
		this.name = name;
		this.name2 = name2;
		System.out.printf(name,roll);
	}
}
public class ClassObjectsMethods {
	public static void main(String[] args) {
		students stud = new students ();
		stud.name = "prem";
		stud.roll= 102;
		stud.calculate();
		
		int store = stud.getName();
		System.out.println(store);
		
		stud.jump(12);
		stud.words("sindu", 21);
		
		String vasan = stud.setName("john");
		System.out.println(vasan);
		
		stud.tryThis("peter", "parker");
		
	}

}
