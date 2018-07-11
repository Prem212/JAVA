package aArrayListMethods;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import edu.emory.mathcs.backport.java.util.Collections;

public class ComparableExamp {
	//@Test
	//public void com() {
	public static void main (String args[])	{
		List<Cricket> li = new ArrayList<Cricket>();
		
		li.add(new Cricket("Prem",10));
		li.add(new Cricket("machi",17));
		li.add(new Cricket("figgy",180));
		li.add(new Cricket("kutta",14));
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		
	}

}
