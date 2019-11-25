package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset 
{
	public static void main(String[] args)
	{
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(34);
		ls.add("SUhel");
		ls.add("kayum");
		ls.add(49.3);
		ls.add("AMmu"); // duplicates not allowed on insertion order manners
		
		
		
		System.out.println("*****using for each*******");
		for(Object s : ls)
		{
			System.out.println(s);
		}
		
		System.out.println("*******using iterator**********");
		Iterator it = ls.iterator();
		while(it.hasNext())
		{
			Object p = it.next();
			System.out.println(p);
		}
	}
}
