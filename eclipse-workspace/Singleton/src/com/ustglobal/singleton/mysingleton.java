package com.ustglobal.singleton;

public class mysingleton 
{
	private static mysingleton instance = null;
    String s;
	
	private mysingleton()
	{
		
	}
	
	public static mysingleton getDBConnection()
	{
		if(instance == null)
		{
			instance = new mysingleton();
		return instance;	
	}else {
		return instance;
	}
  }
}