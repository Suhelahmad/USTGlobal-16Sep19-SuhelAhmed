package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC

{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
	
		l.add(11);
		l.add(12);
		l.add(18);
		l.add(14);
		l.add(10);
		
		Integer peekElement = l.peek();
		System.out.println("Peek Element" + peekElement);
		Integer peekfirstElement = l.peekFirst();
		System.out.println("Peek first Element" + peekfirstElement);
		Integer peeklastElement = l.peekLast();
		System.out.println("Peek Element" + peeklastElement);
}
	
}
