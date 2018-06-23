package eEnum;

public enum Color {
	BLUE("prem"), RED("sindu"), GREEN("viaan");
	private String number;

	Color(String number) {
		this.number = number;

	}

	public String getNumber() {
		return number;
	}

	public String toString() {
		return "the name is :" + number;
	}

}
