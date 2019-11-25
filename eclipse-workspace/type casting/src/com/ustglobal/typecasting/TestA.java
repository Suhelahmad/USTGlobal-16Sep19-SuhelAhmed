package com.ustglobal.typecasting;

public class TestA 
{
	public static void main(String[] args) 
	{
		byte a = 10;
		int b = a;    // Implicit casting
		System.out.println("b is " +b);
		int p = 20;
		double q =p;
		System.out.println("q is" +q);
		System.out.println("====================");
		
		double x = 65.67;
		int y = (int) x;  // Explicit casting
		System.out.println("y is " +y);
		byte z = (byte) x;
		System.out.println(("x is" +x));
		char r = (char) x;
		System.out.println(("r is" +r));
		
	}
}
