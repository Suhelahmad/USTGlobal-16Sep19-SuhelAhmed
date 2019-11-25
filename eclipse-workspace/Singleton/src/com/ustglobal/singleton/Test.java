package com.ustglobal.singleton;

public class Test 
{
	public static void main(String[] args) 
	{
		mysingleton ms = mysingleton.getDBConnection();
		ms.s = "Hello";
		System.out.println("Hashcode of ms" +ms.hashCode());
		mysingleton mx = mysingleton.getDBConnection();
		mx.s = "hi";
		System.out.println("Hashcode of mx" +mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
	}
}
