package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI 
{
	public static void main(String[] args) 
	{
		sortbyname sb = new sortbyname();
		sortbypincode ss = new sortbypincode();
		
		TreeSet<Bank> hs = new TreeSet<Bank>(sb);
		
		Bank e1 = new Bank("SBI", 560076, 645897);
		Bank e2 = new Bank("HDFC",525650,40000);
		Bank e4 = new Bank("ICICI",54545,20000);
		Bank e5 = new Bank("UCO BAnk",45454,15000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("*****using Iterator******");
		Iterator<Bank> it = hs.iterator();
		while(it.hasNext())
		{
			
			Bank e = it.next();
			System.out.println("Name is" +e.name);
			System.out.println("pincode is" +e.pincode);
			System.out.println("micr is" +e.micr);
		
	  }
	}
}
