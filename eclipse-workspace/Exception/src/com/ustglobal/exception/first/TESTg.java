package com.ustglobal.exception.first;

public class TESTg
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		payTM p = new payTM();
		try {
	
		p.book();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught in main");
		}finally {
			System.out.println("executing finaaly");
		}
		
		System.out.println("main ended");
	}
}
