package com.ustglobal.exception.first;

public class TestC
{
	public static void main(String[] args)
	{
		System.out.println("Main Strated");

		int[] a = {10,20,30};
		int b = 10;

		try
		{
			System.out.println(b/0);

		}
		catch(ArithmeticException e)
		{
			System.out.println("number divided by zero");
		}

		try {
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array Index not present");
		}
		System.out.println("main ended");
	}
}