package com.ustglobal.Map;

import java.util.Hashtable;

public class TestH 
{
	public static void main(String[] args)
	{
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(105, "Vijay");
		ht.put(103, "ajay");
		ht.put(102, "Sanjay");
		ht.put(101, "monu");
//		ht.put(null, "john"); not allowed null in key in hashtable
//		ht.put(106, null); not allowed null in value also
		
		
		
		System.out.println("Data " +ht);
		
	}
}
