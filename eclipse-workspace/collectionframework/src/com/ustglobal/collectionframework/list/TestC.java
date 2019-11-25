package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(98.5);
		al.add(true);
		al.add("Good Evening");
		
		
		Iterator ai = al.iterator();
		Object ol = ai.next();
		System.out.println("obj1" +ol);
		
		Object o2 = ai.next();
		System.out.println("obj2" +o2);
		

		Object o3 = ai.next();
		System.out.println("obj3" +o3);
		

		Object o4 = ai.next();
		System.out.println("obj4" +o4);
	
		
		
		System.out.println("========using loop=========");
		for(int i=0;i<al.size();i++)
		{
			
			Object o = al.get(i);
			System.out.println(o);
		}
		
		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add(22.3);
		al1.add("momo");
		al1.add(false);
		al1.add("Suhel");
		
		System.out.println("===========using iterator===========");
		Iterator it1 = al1.iterator();
		
		while(it1.hasNext())
		{
			Object ob = it1.next();
			System.out.println(ob);
		}
		
	}
}
