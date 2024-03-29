package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG
{
	public static void main(String[] args) 
	{
		LinkedList li = new LinkedList();
		li.add(12);
		li.add(34.4);
		li.add("More");
		li.add(true);
		li.add(null);
		
		System.out.println("=====using for loop=======");
		for(int i=0; i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		System.out.println("=====Using Iterator=====");
		Iterator it = li.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("=======Using list iterator=====");
		ListIterator lt = li.listIterator();
		while(lt.hasNext())
		{
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("====List Iterator backward====");
		while(lt.hasPrevious())
		{
			Object o = lt.previous();
			System.out.println(o);
		}
		
		
	}
}
