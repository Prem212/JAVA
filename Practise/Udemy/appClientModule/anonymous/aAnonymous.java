package anonymous;

class forest {
	public void tree() {
		System.out.println("It is tree");
	}
}	

interface pune {
	public void city();
}

public class aAnonymous {
	
	public static void main(String[] args) {
		// forest for1 = new forest ();
		// for1.tree();

		forest for2 = new forest() {
			@Override
			public void tree() {
				System.out.println("It is plant");
			}
		};
		pune pune1 = new pune() {
			public void city() {
				System.out.println("It is pune");
			}
		};

		for2.tree();
		pune1.city();

	}

}
