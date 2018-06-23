package caveOfProgrammingTest;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ")
			.append("World ")
			.append(" this is String Builder");
		System.out.println(sb);

	}

}
