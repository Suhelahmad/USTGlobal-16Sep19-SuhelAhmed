package com.ustglobal.exception.first;

public class payTM 
{
	void book()
	{
		System.out.println("payTM started");
		
		try {
			IRCTC i =new IRCTC();
			i.confirm();
		}
		catch(ArithmeticException e)
		{
			throw e;
		}
		
		System.out.println("payTM ended");
	}
}
