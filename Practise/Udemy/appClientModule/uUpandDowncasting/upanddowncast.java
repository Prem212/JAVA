package uUpandDowncasting;

class car {
	public void wheel() {
		System.out.println("car wheel");
	}
}

class tatanexon extends car{
	public void red() {
		System.out.println("colour is red");
	}
	
	public void wheel() {
		System.out.println("Nexon wheel");
	}
	
}

public class upanddowncast {

	public static void main(String[] args) {
		car car1 = new car();
		tatanexon nex1= new tatanexon();
		
		car1.wheel();
		
		//Up casting: We can create instance for parent class(car) and  child class (nexon) can be assign to it.
		
		car car2 = new tatanexon();
		car2.wheel();
		
	// Down casting: We cannot create instance for child class(nexon) and  parent class (car) cannot be assigned to it.
	// to rectify that we need to down cast that.
		car car3 = new car();
		tatanexon nexon2 = (tatanexon)car3;
	
		nexon2.red();
		nexon2.wheel();

	}

}
