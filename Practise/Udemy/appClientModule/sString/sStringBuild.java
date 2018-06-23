package sString;

public class sStringBuild {

	public static void main(String[] args) {
		String car = "";
		car += "This is";
		car += " my";
		car += " Car";

		System.out.println(car);

		StringBuilder sb = new StringBuilder();
		sb.append("What")
		.append(" are")
		.append(" you")
		.append(" doing?");
		
		System.out.println(sb);

		// Formatting

		System.out.printf("This is my no: %-5f\n", 23.56);
		System.out.printf("This is my no: %.5f", 23.56);

	}

}
