package Test;

class airtel {
	String name;

	public airtel() {
		System.out.println("TV");
	}

	public airtel(String name) {
		this();
		this.name=name;
		System.out.println("Broadband");
	}

	public String toString() {
		return "value is :" + name;
	}
}

public class cConstructor {

	public static void main(String[] args) {
		airtel mac = new airtel("shruti");
		iInheritance in = new iInheritance();
		in.donald();
		System.out.println(mac);

	}

}
