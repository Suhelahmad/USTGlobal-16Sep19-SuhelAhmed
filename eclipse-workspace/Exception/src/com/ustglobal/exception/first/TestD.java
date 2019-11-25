package com.ustglobal.exception.first;

public class TestD
{
	public static void main(String[] args)
	{
		System.out.println("Main Strated");
		
		String s = "hello";
		int[] a = {10,20,30};
		int b = 10;

		try
		{
			
			
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);

		}
		catch(NullPointerException ea)
		{
			System.out.println("Dont play w"
					+ "ith null");
		}

//		try {
//			System.out.println(a[2]);
//		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Array Index not present");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("divided by zero");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("main ended");
	}
}