package eEncapsulation;

class en {

	private final int emp = 1;
	private final String name = "Prem";

	public int getEmp() {
		return emp;
	}

	public void setEmp(int emp) {
		// this.emp = emp; it cant be done when there is final
		System.out.println(emp);
		System.out.println(this.emp);
	}

}

public class encapsu {

	public static void main(String[] args) {
		en en1 = new en();
		System.out.println(en1.getEmp());
		en1.setEmp(12);

	}

}
