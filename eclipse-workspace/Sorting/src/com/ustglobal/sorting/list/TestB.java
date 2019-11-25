package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestB
{
	public static void main(String[] args) 
	{
		LinkedList<Laptop> l = new LinkedList<Laptop>();
		Laptop p1 = new Laptop(25000,4,"HP");
		Laptop p2 = new Laptop(25000,6,"DELL");
		Laptop p3 = new Laptop(25000,8,"ACER");
		Laptop p4 = new Laptop(25000,12,"LENOVO");
		Laptop p5 = new Laptop(25000,8,"Mac");
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.add(p5);
		l.add(new Laptop(2000,2, "Acer"));
		
		displayLaptopDetails(l);
	}
	
	static void displayLaptopDetails(LinkedList<Laptop> li)
	{
		Iterator<Laptop> it = li.iterator();
		while(it.hasNext())
		{
		Laptop lp = it.next();
		System.out.println("Brand is " +lp.name);
		System.out.println("Price is" +lp.price);
		System.out.println("Ram is" +lp.ram);
		
		
	}
     }
}
