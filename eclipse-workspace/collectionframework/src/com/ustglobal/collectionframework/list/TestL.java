package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(16);
		l.add(13);
		l.add(15);
		l.add(11);
		
		System.out.println("Before Sorting" +l);
		Collections.sort(l);
		System.out.println("after sorting" +l);
		
		Collections.reverse(l);
		System.out.println("After Reverse " +l);
		
		Collections.shuffle(l);
		System.out.println("after Shuffle " +l);
		
		
	}
}
