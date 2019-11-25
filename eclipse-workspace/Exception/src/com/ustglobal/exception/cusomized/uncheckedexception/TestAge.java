package com.ustglobal.exception.cusomized.uncheckedexception;

public class TestAge
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		
		Validator v = new Validator();
		try {
		v.verify(19);
		}
		catch(InvalidException ie)
		{
			ie.printStackTrace();
			System.out.println("Exception Occured");
		}
		System.out.println("main ended");
	}
}
