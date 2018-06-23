package eEnum;

public class eEnum {

	public static void main(String[] args) {
		Color col = Color.BLUE;

		System.out.println(col);
		System.out.println(Color.RED.getNumber());
		System.out.println(Color.valueOf("RED"));
		System.out.println(Color.GREEN.getClass());
		// System.out.println(Color.values());
		System.out.println(Color.BLUE.compareTo(Color.GREEN));

		Color col2 = Color.valueOf("GREEN");
//		System.out.println(col2);
		for (Color C : Color.values()) {
			System.out.println(C);

		}

	}
}
