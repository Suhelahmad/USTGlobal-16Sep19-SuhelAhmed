package com.ustglobal.exception.cusomized.checkedexception;

public class validateamount 
{
	void checkamount(int amount ) throws InvalidAmountException
	{
		if(amount > 40000)
		{
			throw new InvalidAmountException();
		}
	}
}
