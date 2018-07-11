package aArrayListMethods;

public class Cricket implements Comparable<Cricket> {
	
	String name;
	int run;
	
	public Cricket(String name, Integer run) {
		this.name=name;
		this.run=run;
	}
	
	public String toString() {
		return name+" "+run;
	}
	

	public int compareTo(Cricket obj) {
		// TODO Auto-generated method stub
		//Cricket obj = (Cricket)o;
		if(this.run>obj.run)
			return 1;
		else if (this.run < obj.run)
			return -1;
		else
		return 0;
		
	}
	
	

}
