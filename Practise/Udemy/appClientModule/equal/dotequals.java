package equal;

class forest {
	private String name;
	private int no;
	
	public forest(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		forest other = (forest) obj;
//		System.out.println(other.name+""+this.name);
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		return true;
	}
	
//	System.out.println(for1 .equals(for3));
	
}
public class dotequals {

	public static void main(String[] args) {
		forest for1= new forest("PremkumAR",12);
		forest for2= new forest("sindu",14);
		forest for3= new forest("Prem",12);
		System.out.println(for2.getClass()+"   s");
		
		System.out.println(for1 == for2);
		System.out.println(for1 .equals(for1));
		
		int value1 =1;
		int value2 =1;
		System.out.println(value1 == value2);

		
		String s1 = "prem";
		String s2 = "premkumar".substring(0, 4);
		System.out.println(s1 == s2);
		
		System.out.println(s1 .equals(s2));
		
		

	}

}
