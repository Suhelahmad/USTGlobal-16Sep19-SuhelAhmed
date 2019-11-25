package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestE 
{
	public static void main(String[] args) 
	{
		ArrayList<marker> al = new ArrayList<marker>();
		
		al.add(new marker(10,"Gel Pen"));
		al.add(new marker(10,"Ball Pen"));
		al.add(new marker(10,"Ink Pen"));
		al.add(new marker(10,"Red Pen"));
		al.add(new marker(10,"Normal Pen"));
		
		System.out.println("Before sorting=====>");
		display(al);
		
		
		sortbyprice sb = new sortbyprice();
		sortbyprice sc = new sortbyprice();
//		Collections.sort(al,sb);
		Collections.sort(al,sc);
		
		System.out.println("After Sorting========>");
		display(al);
			
	}
	
	public static void display(ArrayList<marker> p)
	{
		Iterator<marker> itr = p.iterator();
		while(itr.hasNext())
		{
		marker lp = itr.next();
		System.out.println("Pen name is = "  +lp.brand);
		System.out.println("Price is = "  +lp.price);
		
	}
}
}
