package com.ustglobal.exception.cusomized.checkedexception;

public class TestAmount 
{
	public static void main(String[] args) 
	{
		System.out.println("main Started");
		
		validateamount va = new validateamount();
		try {
			va.checkamount(50000);
		}
		catch(InvalidAmountException e)
		{
			System.err.println(e.getMessage());
		}
		System.out.println("main ended");
	}
}
