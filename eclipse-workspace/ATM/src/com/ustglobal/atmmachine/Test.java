package com.ustglobal.atmmachine;

public class Test
{
	public static void main(String[] args) 
	{
		//ATM a = new ATM();
		
		ICICI i = new ICICI();
		i.validatecard();
		i.getinfo();
		
		HDFC h = new HDFC();
		h.validatecard();
		h.getinfo();
		
		SBI s = new SBI();
		s.validatecard();
		s.getinfo();
	}
}
