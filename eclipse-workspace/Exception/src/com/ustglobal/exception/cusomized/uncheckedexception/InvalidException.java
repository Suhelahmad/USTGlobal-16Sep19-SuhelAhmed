package com.ustglobal.exception.cusomized.uncheckedexception;

public class InvalidException extends RuntimeException 
{
	String message = "Invalid age below 18years not allowed";
	
	public InvalidException(String message)
	{
		this.message = message;
	}
	
	@Override
	
	public String getMessage()
	{
		return message;
	}
}
