package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF 
{
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Roopa");
		ts.add("Jaya");
		ts.add("SUshma");
		ts.add("Munni");
		ts.add("Sheela");
		
		
		System.out.println("*****using for each*******");
		for(Object s : ts)
		{
			System.out.println(s);
		}
		
		System.out.println("*******using iterator**********");
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			Object p = it.next();
			System.out.println(p);
		}
	}
		
		
		
	}

