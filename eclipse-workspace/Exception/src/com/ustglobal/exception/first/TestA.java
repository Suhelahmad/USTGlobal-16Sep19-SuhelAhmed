package com.ustglobal.exception.first;

public class TestA
{
	public static void main(String[] args) 
	{
		
	System.out.println("main method");
	
	int[] a = {10,20,30};
	System.out.println(a[1]);
	try {		
	System.out.println(a[3]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Index is not present");
	}
	
	System.out.println("mai ended");
	
	}
}