package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM 
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Suhel");
		al.add("kayum");
		al.add("fayum");
		al.add("wasim");
		al.add("Saad");
		
		System.out.println("Before Sorting--->" +al);
		Collections.sort(al);
		System.out.println("AFter Sorting----->" +al);
		
		
	}
}
