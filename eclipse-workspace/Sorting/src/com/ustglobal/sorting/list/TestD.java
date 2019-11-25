package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestD 
{
	public static void main(String[] args) 
	{
		Pen p1 = new Pen(10,"Gel Pen","Red");
		Pen p2 = new Pen(20,"Ball Pen","Green");
		Pen p3 = new Pen(30,"Ink Pen","Black");
		Pen p4 = new Pen(40,"Cello Pen","Blue");
		Pen p5 = new Pen(50," Pencil","Gray");
		
		ArrayList<Pen> l = new ArrayList<Pen>();
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.add(p5);
		
		display(l);
		
	}
	
	public static void display(ArrayList<Pen> p)
	{
		Iterator<Pen> itr = p.iterator();
		while(itr.hasNext())
		{
		Pen lp = itr.next();
		System.out.println("Pen name is = "  +lp.brand);
		System.out.println("Price is = "  +lp.price);
		System.out.println("Color is = "  +lp.Clr);
	}
}
}
