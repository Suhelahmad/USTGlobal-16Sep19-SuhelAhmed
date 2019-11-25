package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(13);
		ts.add(45);
		ts.add(36); // it shows values in sorted order way not in unorder
			

		System.out.println("*****using for each*******");
		for(Object s : ts)
		{
			System.out.println(s);
		}
		
		System.out.println("*******using iterator**********");
		Iterator<Double> it = ts.iterator();
		while(it.hasNext())
		{
			Object p = it.next();
			System.out.println(p);
		}
	}
		
	}

