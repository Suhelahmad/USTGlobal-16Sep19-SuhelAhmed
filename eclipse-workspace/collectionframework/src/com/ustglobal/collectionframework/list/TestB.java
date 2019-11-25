package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(13);
		al.add(29.5);
		al.add("SUhel");
		
		
		for(Object o : al )
		{
			
			System.out.println(o);
		}
	}
}
