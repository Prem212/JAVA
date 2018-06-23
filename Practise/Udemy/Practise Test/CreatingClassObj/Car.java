package CreatingClassObj;

public class Car {

	private String name;

	public void start() {
		System.out.println("Car starting");
	}

	public Car(String name) {
		this.name = name;
	}

/*	public void setName(String name) {
		this.name = name;
	}*/

	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}

}
