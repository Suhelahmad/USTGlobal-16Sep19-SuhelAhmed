package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ 
{
	public static void main(String[] args) 
	{
		
		TreeSet<Customer> s = new TreeSet<Customer>();
		
		Customer w1 = new Customer("Suhel", 56, 2500);
		Customer w2 = new Customer("Suhel", 56, 2500);
		Customer w3 = new Customer("Suhel", 56, 2500);
		Customer w4 = new Customer("Suhel", 56, 2500);
		
		s.add(w1);
		s.add(w2);
		s.add(w3);
		s.add(w4);
		
		System.out.println("*****using Iterator******");
		Iterator<Customer> it = s.iterator();
		while(it.hasNext())
		{
			
			Customer e = it.next();
			System.out.println("Name is" +e.name);
			System.out.println("pincode is" +e.id);
			System.out.println("micr is" +e.salary);
		
	  }
	}
}
