package com.ustglobal.accessmodifiers.pkg1;

public class TestA
{
	public static void main(String[] args) {
		int a =10;
		System.out.println("a is= " +a);
		Integer b = a;      // Boxing or autoboxing
		System.out.println("b is= " +b);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is" +x);
		int y = x; // unboxing 
		System.out.println("y is = " +y);
		
		int value = Integer.parseInt("123");
		System.out.println("value is" +value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("Result is" +result);
		
	}
}
