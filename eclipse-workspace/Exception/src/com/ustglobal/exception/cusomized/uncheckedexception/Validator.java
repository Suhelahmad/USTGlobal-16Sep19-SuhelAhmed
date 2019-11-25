package com.ustglobal.exception.cusomized.uncheckedexception;

public class Validator
{
	void verify(int age)
	{
		if(age < 18)
		{
			throw new InvalidException();
		}
	}
}
