package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Double> li = new LinkedHashSet<Double>();
		li.add(34.2);
		li.add(25.23);
		li.add(1.2);
		li.add(8.36);
		li.add(56.32); // duplicates not allowed on insertion order manners
		
		
		
		System.out.println("*****using for each*******");
		for(Object s : li)
		{
			System.out.println(s);
		}
		
		System.out.println("*******using iterator**********");
		Iterator<Double> it = li.iterator();
		while(it.hasNext())
		{
			Object p = it.next();
			System.out.println(p);
		}
	}
	}

